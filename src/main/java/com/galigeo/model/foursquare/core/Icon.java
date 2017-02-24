package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Icon {
	public	String	prefix;
	public	String	suffix;
	
	public Icon() {}
}
