package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringLowercaseAndUppercaseRequest;

public class StringLowercaseAndUppercaseResponse {
	
	@JsonProperty(required = true)
	private StringLowercaseAndUppercaseRequest stringLowercaseAndUppercaseRequest;
	private String lowercase;
	private String uppercase;
	
	public StringLowercaseAndUppercaseRequest getStringLowercaseAndUppercaseRequest() {
		return stringLowercaseAndUppercaseRequest;
	}
	public void setStringLowercaseAndUppercaseRequest(
			StringLowercaseAndUppercaseRequest stringLowercaseAndUppercaseRequest) {
		this.stringLowercaseAndUppercaseRequest = stringLowercaseAndUppercaseRequest;
	}
	public String getLowercase() {
		return lowercase;
	}
	public void setLowercase(String lowercase) {
		this.lowercase = lowercase;
	}
	public String getUppercase() {
		return uppercase;
	}
	public void setUppercase(String uppercase) {
		this.uppercase = uppercase;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lowercase, uppercase);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringLowercaseAndUppercaseResponse other = (StringLowercaseAndUppercaseResponse) obj;
		return Objects.equals(lowercase, other.lowercase) && Objects.equals(uppercase, other.uppercase);
	}
	
	@Override
	public String toString() {
		return "StringLowercaseAndUppercaseResponse [lowercase=" + lowercase + ", uppercase=" + uppercase + "]";
	}
	
	
}
