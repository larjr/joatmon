package br.com.larjr.joatmon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringInvertTextRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringInvertTextResponse {
	
	@JsonProperty(required = true) private StringInvertTextRequest stringInvertTextRequest;
	private String invertText;
}
