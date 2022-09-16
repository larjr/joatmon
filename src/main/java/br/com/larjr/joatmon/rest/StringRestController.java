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
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}