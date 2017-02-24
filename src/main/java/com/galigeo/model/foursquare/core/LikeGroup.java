package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LikeGroup {
	public String 	type;
	public int 		count;
	public User[]	items;
}
