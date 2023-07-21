package br.com.larjr.joatmon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringCountRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringCountResponse {

	@JsonProperty(required = true) private StringCountRequest stringCountRequest;
	private Long caracters;
	private Long caractersWithoutSpaces;
	private Long words;
	private Long spaces;
	private Long lines;
	private Long vowels;
	private Long numbers;
}
