package br.com.larjr.joatmon.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.larjr.joatmon.dto.HelloWorldDTO;

@RestController
@RequestMapping("/v1/hello-world")
public class HelloWorldRestController {
	
	@GetMapping("")
	public ResponseEntity<HelloWorldDTO> hello(){
		return new ResponseEntity<>(new HelloWorldDTO(), HttpStatus.OK);
	}

}
