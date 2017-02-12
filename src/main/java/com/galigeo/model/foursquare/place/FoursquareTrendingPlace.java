package com.galigeo.model.foursquare.place;

import com.galigeo.model.AbstractPost;

/**
 * A place that is currently trending on Foursquare.
 */
public class FoursquareTrendingPlace extends AbstractPost {

    public      String placeCategory;
	public 		String canonicalURL;
    public      String venueID;

	public 		int   checkinCount;
	public 		int   usersCount;
	public		int   tipCount;
    public		int   hereNow;
	
	public String toString(){
		return String.format("4S %s,%s \"%s\" (%s), here now:%d", this.getLat(), this.getLng(), locationName, placeCategory, hereNow);
	}
}
