package br.com.larjr.joatmon.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class CPFGeneratorRequest {

    @JsonProperty(required = true) private String cpf;
}
