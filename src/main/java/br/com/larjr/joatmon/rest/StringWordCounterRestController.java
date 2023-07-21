package br.com.larjr.joatmon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.request.StringWordCounterRequest;
import br.com.larjr.joatmon.dto.response.StringWordCounterResponse;

@RestController
@RequestMapping("/v1/string")
public class StringWordCounterRestController {
	
	@PostMapping("/word-counter")
	public ResponseEntity<StringWordCounterResponse> hello(@RequestBody StringWordCounterRequest request){

		String texto = request.getText();
		String palavra = request.getWord();

		StringWordCounterResponse response =
				StringWordCounterResponse
						.builder()
						.stringWordCounterRequest(request)
						.wordOccurrenceCounter(contarOcorrenciaDePalavras(texto, palavra))
						.build();
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	private Long contarOcorrenciaDePalavras(String texto, String palavra) {
		
		String[] pontos = {".", ",", "!", "?", ":"};
		for (int p = 0; p < pontos.length; p++) {
			
			texto = texto.replace(pontos[p], "");
		}
		String[] palavras = texto.split(" ");
		int contador = 0;
		for(int i = 0; i < palavras.length; i++) {
			
			if (palavras[i].equalsIgnoreCase(palavra)) {
				contador = contador + 1;
			}
		}
		return Long.valueOf(contador);
	}
}