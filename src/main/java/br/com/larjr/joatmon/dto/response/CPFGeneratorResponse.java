package br.com.larjr.joatmon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import br.com.larjr.joatmon.dto.request.CPFGeneratorRequest;

import java.util.Objects;

public class CPFGeneratorResponse {

    @JsonProperty(required = true)
    private CPFGeneratorRequest cpfGeneratorRequest;
    private String cpf = "";

    public CPFGeneratorRequest getCpfGeneratorRequest() {return cpfGeneratorRequest;}

    public void setCpfGeneratorRequest(CPFGeneratorRequest cpfGeneratorRequest) {
        this.cpfGeneratorRequest = cpfGeneratorRequest;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CPFGeneratorResponse other = (CPFGeneratorResponse) obj;
        return Objects.equals(cpfGeneratorRequest, other.cpfGeneratorRequest) && Objects.equals(cpf, other.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfGeneratorRequest, cpf);
    }

    @Override
    public String toString() {
        return "CPFGeneratorResponse[" +
                "cpfGeneratorRequest=" + cpfGeneratorRequest +
                ", cpf='" + cpf + '\'' +
                ']';
    }
}
