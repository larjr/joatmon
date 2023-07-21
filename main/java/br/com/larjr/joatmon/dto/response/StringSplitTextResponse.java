package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringSplitTextRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringSplitTextResponse {

	@JsonProperty(required = true)	private StringSplitTextRequest stringSplitTextRequest;
	private String splitText;
}	
