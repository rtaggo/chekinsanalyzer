package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Statistic {
	public int	checkinsCount;
	public int	usersCount;
	public int	tipCount;
}
