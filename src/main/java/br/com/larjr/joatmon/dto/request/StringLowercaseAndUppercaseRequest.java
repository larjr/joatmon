package br.com.larjr.joatmon.dto.request;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StringLowercaseAndUppercaseRequest {
	
	@JsonProperty(required = true)
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public int hashCode() {
		return Objects.hash(text);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringLowercaseAndUppercaseRequest other = (StringLowercaseAndUppercaseRequest) obj;
		return Objects.equals(text, other.text);
	}

	@Override
	public String toString() {
		return "StringLowercaseAndUppercaseRequest [text=" + text + "]";
	}	
}
