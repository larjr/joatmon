package br.com.larjr.joatmon.dto;

import java.time.LocalDateTime;
import java.util.Objects;

public class HelloWorldDTO {
	private String greeting;
	private LocalDateTime localDateTime;
	
	public HelloWorldDTO() {
		super();
		this.greeting = "Hello World!";
		this.localDateTime = LocalDateTime.now();
	}

	public HelloWorldDTO(String greeting, LocalDateTime localDateTime) {
		super();
		this.greeting = greeting;
		this.localDateTime = localDateTime;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(greeting, localDateTime);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HelloWorldDTO other = (HelloWorldDTO) obj;
		return Objects.equals(greeting, other.greeting) && Objects.equals(localDateTime, other.localDateTime);
	}

	@Override
	public String toString() {
		return "HelloWorldDTO [greeting=" + greeting + ", localDateTime=" + localDateTime + "]";
	}

}
