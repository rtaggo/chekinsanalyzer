package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
	public String 	id;
	public String 	name;
	public String 	pluralName;
	public String 	shortName;
	public Icon		icon;
	public Boolean	primary;
}
