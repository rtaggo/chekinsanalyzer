package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
	public	String	id;
	public	String	firstName;
	public	String	lastName;
	public	String	gender;
	public	Photo	photo;	
}
