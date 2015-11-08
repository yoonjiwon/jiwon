package com.pratice.project.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class STAT {
	@JsonProperty("stat")
	@JsonInclude(Include.NON_NULL)
	private String stat;
	
	@JsonProperty("cause")
	@JsonInclude(Include.NON_NULL)
	private String cause;

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}

}
