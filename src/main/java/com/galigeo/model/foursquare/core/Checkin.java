package com.galigeo.model.foursquare.core;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Checkin {
	public	String		id;
	public	Date		createdAt;
	public	String		type = "checkin";
	public	Entity[]	entities;
	public	String		shout;
	public	int			timeZoneOffset;
	public	User		user;
	
	public	Venue		venue;
	public	Source		source;
	public	Photos		photos;
	public	Likes		likes;
	public	Sticker		sticker;
	
	public	String		reasonCannotSeeComments;
	public	String		reasonCannotAddComments;
}
