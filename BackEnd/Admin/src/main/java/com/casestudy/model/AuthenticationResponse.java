package com.casestudy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor

public class AuthenticationResponse {
	
	private String jwt;

	/*
	 * public AuthenticationResponse() { super(); }
	 * 
	 * public AuthenticationResponse(String jwt) { super(); this.jwt = jwt; }
	 * 
	 * public String getJwt() { return jwt; }
	 * 
	 * public void setJwt(String jwt) { this.jwt = jwt; }
	 */
	

}
