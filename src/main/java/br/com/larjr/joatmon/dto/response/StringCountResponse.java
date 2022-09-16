package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringCountRequest;

public class StringCountResponse {

	@JsonProperty(required = true)
	private StringCountRequest stringCountRequest;
	private Long caracters;
	private Long caractersWithoutSpaces;
	private Long words;
	private Long spaces;
	private Long lines;
	private Long vowels;
	private Long numbers;

	public StringCountRequest getStringCountRequest() {
		return stringCountRequest;
	}

	public void setStringCountRequest(StringCountRequest stringCountRequest) {
		this.stringCountRequest = stringCountRequest;
	}

	public Long getCaracters() {
		return caracters;
	}

	public void setCaracters(Long caracters) {
		this.caracters = caracters;
	}

	public Long getCaractersWithoutSpaces() {
		return caractersWithoutSpaces;
	}

	public void setCaractersWithoutSpaces(Long caractersWithoutSpaces) {
		this.caractersWithoutSpaces = caractersWithoutSpaces;
	}

	public Long getWords() {
		return words;
	}

	public void setWords(Long words) {
		this.words = words;
	}

	public Long getSpaces() {
		return spaces;
	}

	public void setSpaces(Long spaces) {
		this.spaces = spaces;
	}

	public Long getLines() {
		return lines;
	}

	public void setLines(Long lines) {
		this.lines = lines;
	}

	public Long getVowels() {
		return vowels;
	}

	public void setVowels(Long vowels) {
		this.vowels = vowels;
	}

	public Long getNumbers() {
		return numbers;
	}

	public void setNumbers(Long numbers) {
		this.numbers = numbers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caracters, caractersWithoutSpaces, lines, numbers, spaces, stringCountRequest, vowels,
				words);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringCountResponse other = (StringCountResponse) obj;
		return Objects.equals(caracters, other.caracters)
				&& Objects.equals(caractersWithoutSpaces, other.caractersWithoutSpaces)
				&& Objects.equals(lines, other.lines) && Objects.equals(numbers, other.numbers)
				&& Objects.equals(spaces, other.spaces) && Objects.equals(stringCountRequest, other.stringCountRequest)
				&& Objects.equals(vowels, other.vowels) && Objects.equals(words, other.words);
	}

	@Override
	public String toString() {
		return "StringCountResponse [stringCountRequest=" + stringCountRequest + ", caracters=" + caracters
				+ ", caractersWithoutSpaces=" + caractersWithoutSpaces + ", words=" + words + ", spaces=" + spaces
				+ ", lines=" + lines + ", vowels=" + vowels + ", numbers=" + numbers + "]";
	}

}
