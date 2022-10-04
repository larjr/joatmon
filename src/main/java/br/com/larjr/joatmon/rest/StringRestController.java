package br.com.larjr.joatmon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.request.StringCountRequest;
import br.com.larjr.joatmon.dto.response.StringCountResponse;

@RestController
@RequestMapping("/v1/string")
public class StringRestController {

	@PostMapping("/count")
	public ResponseEntity<StringCountResponse> hello(@RequestBody StringCountRequest request){
		StringCountResponse response = new StringCountResponse();
		response.setStringCountRequest(request);
		response.setCaracters(Long.valueOf((request.getText().length())));

		String texto = request.getText();
		
		response.setCaractersWithoutSpaces(contarCaracteresSemEspaco(texto));
		
		response.setWords(contarPalavras(texto));
		
		response.setSpaces(contarEspaços(texto));
		
		response.setLines(contarLinhas(texto));
		
		response.setVowels(contarVogal(texto));
		
		response.setNumbers(Long.valueOf(contarNumeros(texto)));
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	private Long contarCaracteresSemEspaco(String texto){
		String semEspaco = texto.replace(" ", "");
		return Long.valueOf(semEspaco.length());
	}
	
	private Long contarPalavras(String texto) {
		String[] palavras = texto.split(" ");
		return Long.valueOf(palavras.length);
	}
	
	private Long contarLinhas(String texto) {
		int linhas = 0;
		if (texto.contains("\r\n")) {
			linhas += 1;
		}
		return Long.valueOf(linhas);
	}
	
	private Long contarEspaços(String texto) {
		String semEspaco = texto.replace(" ", "");
		return Long.valueOf(texto.length() - semEspaco.length());
	}
	
	private Long contarVogal(String texto) {
		String semEspaco = texto.replace(" ", "");
		int contador = 0;
		for (int i = 0; i < semEspaco.length(); i++) {
			if (semEspaco.charAt(i) == 'a' || semEspaco.charAt(i) == 'e' || semEspaco.charAt(i) == 'i' || semEspaco.charAt(i) == 'o' || semEspaco.charAt(i) == 'u') {
				contador++;
			}
		}
		return Long.valueOf(contador);
	}
	
	private Long contarNumeros(String texto) {
		String semEspaco = texto.replace(" ", "");
		char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int totalNumeros = 0;
		for (int t = 0; t < semEspaco.length(); t++) {
			for (int n = 0; n < numeros.length; n++) {
				if (semEspaco.charAt(t) == numeros[n]) {
					totalNumeros++;
				}
			}
		}
		return Long.valueOf(totalNumeros);
	}

}