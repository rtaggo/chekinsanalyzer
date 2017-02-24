package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Likes {
	public int			count;
	public LikeGroup[] 	groups;
	public String		summary;
}
