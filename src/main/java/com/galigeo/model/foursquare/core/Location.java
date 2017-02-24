package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
	public	String 			address;
	public	double 			lat;
	public	double			lng;
	public 	LabeledLatLng[] labeledLatLngs;
	public	String 			postalCode;
	public	String			cc;
	public	String			city;
	public	String			state;
	public	String			country;
	public	String[]		formattedAddress;
	
}
