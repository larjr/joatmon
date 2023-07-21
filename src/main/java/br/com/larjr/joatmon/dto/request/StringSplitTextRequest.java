package br.com.larjr.joatmon.dto.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.extern.jackson.Jacksonized;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class StringSplitTextRequest {

	@JsonProperty(required = true) private String text;
}
