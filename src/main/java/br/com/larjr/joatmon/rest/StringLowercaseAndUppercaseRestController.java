package br.com.larjr.joatmon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.request.StringLowercaseAndUppercaseRequest;
import br.com.larjr.joatmon.dto.response.StringLowercaseAndUppercaseResponse;

@RestController
@RequestMapping("/v1/string")
public class StringLowercaseAndUppercaseRestController {
	
	@PostMapping("/lowercaseanduppercase")
	
	public ResponseEntity<StringLowercaseAndUppercaseResponse> hello(@RequestBody StringLowercaseAndUppercaseRequest request) {
		StringLowercaseAndUppercaseResponse response = new StringLowercaseAndUppercaseResponse();
		response.setStringLowercaseAndUppercaseRequest(request);
		String texto = request.getText();
		response.setLowercase(minusculo(texto));
		response.setUppercase(maiusculo(texto));
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	private String minusculo(String texto) {
		return texto.toLowerCase();
	}
	private String maiusculo(String texto) {
		return texto.toUpperCase();
	}
}
