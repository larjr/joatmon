package br.com.larjr.joatmon.rest;

import br.com.larjr.joatmon.dto.request.CPFGeneratorRequest;
import br.com.larjr.joatmon.dto.response.CPFGeneratorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/v1/cpf")
public class CPFRestController {

    @PostMapping("generator")
    public ResponseEntity<CPFGeneratorResponse> hello(@RequestBody CPFGeneratorRequest request){
        CPFGeneratorResponse response =
                CPFGeneratorResponse
                .builder()
                .cpfGeneratorRequest(request)
                .build();

        String cpf = "";
        for(int i=0;i<11;i++){
            Random random = new Random();
            int x = random.nextInt(9);
            cpf += x;
        }
        response.setCpf(cpf);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
