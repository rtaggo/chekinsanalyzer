package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Photos {
	public int			count;
	public PhotoItem[]	items;
	public Layout		layout;
}
