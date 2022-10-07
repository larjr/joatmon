package br.com.larjr.joatmon.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class CPFGeneratorRequest {

    @JsonProperty(required = true)
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        CPFGeneratorRequest other = (CPFGeneratorRequest) obj;
        return cpf.equals(other.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "CPFGeneratorRequest[" +
                "cpf=" + cpf + "]";
    }
}
