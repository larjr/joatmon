package br.com.larjr.joatmon.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringWordCounterRequest;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringWordCounterResponse {

		@JsonProperty(required = true) private StringWordCounterRequest stringWordCounterRequest;
		private Long wordOccurrenceCounter;
}
