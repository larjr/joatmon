package br.com.larjr.joatmon.dto.response;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.larjr.joatmon.dto.request.StringWordCounterRequest;

public class StringWordCounterResponse {

		@JsonProperty(required = true)
		private StringWordCounterRequest stringWordCounterRequest;
		private Long wordOccurrenceCounter;
		
		public StringWordCounterRequest getStringWordCounterRequest() {
			return stringWordCounterRequest;
		}
		public void setStringWordCounterRequest(StringWordCounterRequest stringWordCounterRequest) {
			this.stringWordCounterRequest = stringWordCounterRequest;
		}
		public Long getWordOccurrenceCounter() {
			return wordOccurrenceCounter;
		}
		public void setWordOccurrenceCounter(Long wordOccurrenceCounter) {
			this.wordOccurrenceCounter = wordOccurrenceCounter;
		}
		@Override
		public int hashCode() {
			return Objects.hash(stringWordCounterRequest, wordOccurrenceCounter);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			StringWordCounterResponse other = (StringWordCounterResponse) obj;
			return Objects.equals(stringWordCounterRequest, other.stringWordCounterRequest)
					&& Objects.equals(wordOccurrenceCounter, other.wordOccurrenceCounter);
		}
		@Override
		public String toString() {
			return "StringWordCounterResponse [stringWordCounterRequest=" + stringWordCounterRequest
					+ ", wordOccurrenceCounter=" + wordOccurrenceCounter + "]";
		}	
}
