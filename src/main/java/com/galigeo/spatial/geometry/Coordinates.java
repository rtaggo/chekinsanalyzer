package com.galigeo.spatial.geometry;

public class Coordinates {
	public double lat;
    public double lng;

    public Coordinates(){};

    public Coordinates(double lat, double lng){
        this.lat = lat;
        this.lng = lng;
    }

    public double getLat(){
        return this.lat;
    }

    public double getLng(){
        return this.lng;
    }

    public boolean isNull(){
        return (this.lat==0.0 && this.lng==0.0);
    }
    
    public boolean isInBounds(Coordinates[] bounds){
    	if (!isNull()) {
    		Coordinates NE = bounds[0];
    		Coordinates SW = bounds[1];
    		
    		return (this.lat <= NE.getLat() &&
    				this.lat >= SW.getLat() &&
    				this.lng <= NE.getLng() && 
    				this.lng >= SW.getLng());
    	} 
    	return false;
    }

    @Override
    public String toString(){
        return lat+","+lng;
    }
}
