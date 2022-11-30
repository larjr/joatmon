package br.com.larjr.joatmon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.request.StringInvertTextRequest;
import br.com.larjr.joatmon.dto.response.StringInvertTextResponse;

@RestController
@RequestMapping("v1/string")

public class StringInvertTextRestController {
	
	@PostMapping("/inverttext")
	public ResponseEntity<StringInvertTextResponse> hello(@RequestBody StringInvertTextRequest request) {
		StringInvertTextResponse response = new StringInvertTextResponse();
		response.setStringInvertTextRequest(request);
		String texto = request.getText();
		response.setInvertText(inverterTexto(texto));
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	private String inverterTexto(String texto) {
		
		String textoInvertido = "";
		for(int i = 0; i < texto.length(); i++) {
			textoInvertido = texto.charAt(i) + textoInvertido;
		}
		return textoInvertido;
	}
}
