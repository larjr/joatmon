package br.com.larjr.joatmon.dto;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class HelloWorldDTO {

	private String greeting;
	private LocalDateTime localDateTime;
}
