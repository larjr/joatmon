package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringSplitTextRequest;

public class StringSplitTextResponse {
	@JsonProperty(required = true)
	private StringSplitTextRequest stringSplitTextRequest; 
	private String splitText;
	public StringSplitTextRequest getStringSplitTextRequest() {
		return stringSplitTextRequest;
	}
	public void setStringSplitTextRequest(StringSplitTextRequest stringSplitTextRequest) {
		this.stringSplitTextRequest = stringSplitTextRequest;
	}
	public String getSplitText() {
		return splitText;
	}
	public void setSplitText(String splitText) {
		this.splitText = splitText;
	}
	@Override
	public int hashCode() {
		return Objects.hash(splitText, stringSplitTextRequest);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringSplitTextResponse other = (StringSplitTextResponse) obj;
		return Objects.equals(splitText, other.splitText)
				&& Objects.equals(stringSplitTextRequest, other.stringSplitTextRequest);
	}
	@Override
	public String toString() {
		return "StringSplitTextResponse [stringSplitTextRequest=" + stringSplitTextRequest + ", splitText=" + splitText
				+ "]";
	}
}	
