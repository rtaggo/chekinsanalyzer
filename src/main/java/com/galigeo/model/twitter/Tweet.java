package com.galigeo.model.twitter;

import java.util.Date;

import com.galigeo.model.AbstractPost;

/**
 * A tweet.
 */
public class Tweet extends AbstractPost {
	public 		String   twitterId;
	public      Date     createdAt;
	public		String	 fromUserId;

    public      int      followersCount;
    public      int      retweetCount;
    public      int      favoriteCount;
    public      boolean  isReply;
    public      String   source;
    public      String   location;
    public      boolean  isRetweet;
    public      String   language;
    public      String   fullURL;
    public      String   mediaURL;
    
    public		boolean	 fromInstagam = false;
    public		boolean	 isFoursquare    = false;
    
	
    /*
    @Override
	public String toString() {
		return "Tweet [twitterId=" + twitterId + ", fromUserId=" + fromUserId
				+ ", followersCount=" + followersCount + ", retweetCount="
				+ retweetCount + ", favoriteCount=" + favoriteCount
				+ ", location=" + location + ", language=" + language
				+ ", text=" + text + ", popularity=" + popularity + "]";
	}
	*/

	/*
	 */
	public String toString(){
        String sText = text.replaceAll("\n"," ");
        /*
        String startText = "TW [pop="+popularity + ", followersCount=" + followersCount + ", retweetCount="
				+ retweetCount + ", favoriteCount=" + favoriteCount
				+ ", location=" + location + ", language=" + language + "] ";
		*/
        String startText = "TW [pop="+popularity + ", followersCount=" + followersCount + ", retweetCount="
				+ retweetCount + ", favoriteCount=" + favoriteCount + "] ";
        /*
        if (this.hasCoordinates() && this.locationName!=null)
            return startText + createdAt +" ["+this.getLat()+","+this.getLng()+"] ("+locationName+") "+userName+": "+sText;
		else if (this.hasCoordinates())
            return startText + createdAt +" ["+this.getLat()+","+this.getLng()+"] "+userName+": "+sText;
        else if (this.locationName!=null)
            return startText + createdAt +" "+locationName+" "+userName+": "+sText;
        else
            return startText + createdAt +" [NO LOCATION] "+userName+": "+sText;
        */
        if (this.hasCoordinates() && this.locationName!=null)
            return startText +" ["+this.getLat()+","+this.getLng()+"] " + userName + ": "+ sText + " ("+locationName+") " + " [" + createdAt + "]";
		else if (this.hasCoordinates())
            return startText +" ["+this.getLat()+","+this.getLng()+"] " + userName + ": "+ sText + " [" + createdAt + "]";
        else if (this.locationName!=null)
            return startText + " " + locationName + " " + userName + ": " + sText + " [" + createdAt + "]";
        else
            return startText + " [NO LOCATION] " + userName + ": " + sText + " [" + createdAt + "]";
	}
}
