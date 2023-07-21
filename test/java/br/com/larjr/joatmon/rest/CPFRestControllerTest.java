package br.com.larjr.joatmon.rest;

import br.com.larjr.joatmon.dto.response.CPFGeneratorResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CPFRestControllerTest {

    private CPFGeneratorResponse _response;
    private CPFRestController _controller;

    @Test
    void testGerarCPF(){

        _controller = new CPFRestController();

        String cpf = _controller.gerarCPF();
        _response =
                CPFGeneratorResponse
                .builder()
                .cpf(cpf)
                .build();

        assertNotNull(CPFRestController.gerarCPF());
        assertNotNull(cpf);
        assertEquals(cpf, _response.getCpf());
        assertNotEquals(_controller.gerarCPF(), _response);
        assertNotEquals(_controller.gerarCPF(), cpf);
    }
}
