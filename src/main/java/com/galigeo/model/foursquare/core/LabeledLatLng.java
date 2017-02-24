package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LabeledLatLng {
	public	String	label;
	public	double	lat;
	public	double	lng;	
}
