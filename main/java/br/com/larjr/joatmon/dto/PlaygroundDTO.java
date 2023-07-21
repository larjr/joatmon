package br.com.larjr.joatmon.dto;

import lombok.*;
import lombok.extern.jackson.Jacksonized;

/**
 * Uma simples classes para ficar utilizando de exemplo durante as explicacoes
 * da mentoria
 * 
 * @author @luisangelorjr
 */

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Jacksonized
public class PlaygroundDTO {

	private char exemploDeChar;
	private String exemploDeString;
}
