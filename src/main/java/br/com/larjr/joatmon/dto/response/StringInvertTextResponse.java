package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringInvertTextRequest;

public class StringInvertTextResponse {
	
	@JsonProperty(required = true)
	private StringInvertTextRequest stringInvertTextRequest;
	private String invertText;
	
	public StringInvertTextRequest getStringInvertTextRequest() {
		return stringInvertTextRequest;
	}
	public void setStringInvertTextRequest(StringInvertTextRequest stringInvertTextRequest) {
		this.stringInvertTextRequest = stringInvertTextRequest;
	}
	public String getInvertText() {
		return invertText;
	}
	public void setInvertText(String invertText) {
		this.invertText = invertText;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(invertText, stringInvertTextRequest);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringInvertTextResponse other = (StringInvertTextResponse) obj;
		return Objects.equals(invertText, other.invertText)
				&& Objects.equals(stringInvertTextRequest, other.stringInvertTextRequest);
	}
	@Override
	public String toString() {
		return "StringInvertTextResponse [stringInvertTextRequest=" + stringInvertTextRequest + ", invertText="
				+ invertText + "]";
	}
}
