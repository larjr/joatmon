package br.com.larjr.joatmon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import br.com.larjr.joatmon.dto.request.CPFGeneratorRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class CPFGeneratorResponse {

    @JsonProperty(required = true) private CPFGeneratorRequest cpfGeneratorRequest;
    private String cpf;
}
