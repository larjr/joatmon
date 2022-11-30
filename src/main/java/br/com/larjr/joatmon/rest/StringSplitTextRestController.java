package br.com.larjr.joatmon.rest;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.request.StringSplitTextRequest;
import br.com.larjr.joatmon.dto.response.StringSplitTextResponse;

@RestController
@RequestMapping("/v1/string")
public class StringSplitTextRestController {
	
	@PostMapping("/split-text")
	public ResponseEntity<StringSplitTextResponse> hello(@RequestBody StringSplitTextRequest request){
		StringSplitTextResponse response = new StringSplitTextResponse();
		response.setStringSplitTextRequest(request);
		String texto = request.getText();
		
		response.setSplitText(separarTexto(texto));
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
		
	private String separarTexto(String texto) {
		
		String semEspaco = texto.replace(" ", "");
		String[] divisao = semEspaco.split("");
		
		return Arrays.toString(divisao).replaceAll("\\[|\\]", "").replaceAll(",", "");
	}
}
