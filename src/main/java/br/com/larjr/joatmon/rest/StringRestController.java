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
		String semEspaco = texto.replace(" ", "");
		
		//NUMBER OF CARACTERS WITHOUT SPACES
		response.setCaractersWithoutSpaces(Long.valueOf(semEspaco.length()));
		
		//NUMBER OF SPACES
		int Espacos = texto.length() - semEspaco.length();
		response.setSpaces(Long.valueOf(Espacos));

		//NUMBER OF VOWELS
		int contador = 0;
		for (int i = 0; i < semEspaco.length(); i++) {
			if (semEspaco.charAt(i) == 'a' || semEspaco.charAt(i) == 'e' || semEspaco.charAt(i) == 'i' || semEspaco.charAt(i) == 'o' || semEspaco.charAt(i) == 'u') {
				contador++;
			}
		}
		response.setVowels(Long.valueOf(contador));
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}