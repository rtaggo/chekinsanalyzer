package com.galigeo.model.foursquare;

import java.util.Date;

public class Checkin {
	public	String		id;
	public	Date		createdAt;
	public	String		type = "checkin";
	//public	Entity[]	entities;
	public	String		shout;
	public	int			timeZoneOffset;
	public	User		user;
	
	public	Venue		venue;
	public	Source		source;
	
	public	String		reasonCannotSeeComments;
	public	String		reasonCannotAddComments;	
}
