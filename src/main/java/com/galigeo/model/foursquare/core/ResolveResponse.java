package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResolveResponse {
	public Meta meta;
	public Response response;
}
