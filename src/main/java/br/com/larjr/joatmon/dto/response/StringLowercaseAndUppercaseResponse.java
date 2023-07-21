package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringLowercaseAndUppercaseRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringLowercaseAndUppercaseResponse {
	
	@JsonProperty(required = true)
	private StringLowercaseAndUppercaseRequest stringLowercaseAndUppercaseRequest;
	private String lowercase;
	private String uppercase;
}