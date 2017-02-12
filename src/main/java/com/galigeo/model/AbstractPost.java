package com.galigeo.model;

import com.galigeo.spatial.geometry.Coordinates;
import com.google.gson.Gson;

public class AbstractPost {
	public	 	String       id;
    public      String       myType;
    public      long         indexDate;
    private     Coordinates  coordinates    = new Coordinates();
    public      String       locationName;
    public      String       userName; // screen name, not the clear name
    public      String       text;
    public      double       popularity     = -1;

    public AbstractPost(){
        this.myType = this.getClass().getName();
    }

    public boolean equals(Object o){
        if (! (o instanceof AbstractPost)) return false;
        AbstractPost post = (AbstractPost)o;
        if (this.id == null) return false;
        return (this.id.equals(post.id));
    }

    public void setLocationName(String locationName){
        this.locationName = locationName;
    }

    public double getLat(){
        return this.coordinates.getLat();
    }

    public double getLng(){
        return this.coordinates.getLng();
    }

    public void setCoordinates(final double lat, final double lon){
        this.coordinates = new Coordinates(lat,lon);
    }

    public boolean hasCoordinates(){
        return !this.coordinates.isNull();
    }
    
    public boolean isInBounds(Coordinates[] bounds){
    	if (hasCoordinates()) {
    		return this.coordinates.isInBounds(bounds);
    	} 
    	return false;
    }

    public String getType(){
        return this.getClass().getSimpleName();
    }

    public String asJSON(){
        return new Gson().toJson(this);
    }
}
