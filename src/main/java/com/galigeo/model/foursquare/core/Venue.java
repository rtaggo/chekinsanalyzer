package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {
	public	String		id;
	public	String		name;
	public	Contact		contact;
	public	Location	location;
	public	Category[]	categories;
	public	Boolean		verified;
	public	Statistic	stats;
	public	String		url;
	public	Menu		menu;
	public	Boolean		allowMenuUrlEdit;
	public	BeenHere	beenHere;
	
}
