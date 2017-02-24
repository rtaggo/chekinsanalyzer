package com.galigeo.model.foursquare.core;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PhotoItem {
	public String 	id;
	public Date 	createdAt;
	public String 	prefix;
	public String 	suffix;
	public int 		width;
	public int 		height;
	public User 	user;
	public String 	visibility;
}
