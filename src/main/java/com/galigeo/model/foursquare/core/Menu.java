package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Menu {
	public String type;
	public String label;
	public String anchor;
	public String url;
	public String mobileUrl;
	public String externalUrl;
}
