package br.com.larjr.joatmon.dto.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringWordCounterRequest {
	
	@JsonProperty(required = true)
	private String text;
	private String word;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	@Override
	public int hashCode() {
		return Objects.hash(text, word);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringWordCounterRequest other = (StringWordCounterRequest) obj;
		return Objects.equals(text, other.text) && Objects.equals(word, other.word);
	}
	@Override
	public String toString() {
		return "StringWordCounterRequest [text=" + text + ", word=" + word + "]";
	}
	
	
}
