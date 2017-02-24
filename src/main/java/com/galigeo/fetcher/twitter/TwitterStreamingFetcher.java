package com.galigeo.fetcher.twitter;

import com.galigeo.configuration.Config;
import com.galigeo.fetcher.foursquare.CheckInResolver;
import com.galigeo.model.foursquare.core.Checkin;
import com.galigeo.model.twitter.Tweet;
import com.google.gson.Gson;

import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterStreamingFetcher {
	public TwitterStreamingFetcher(){
        if (Config.TWITTER_ACCESSTOKENSECRET==null){
            System.out.println("Please add your Twitter API credentials to com.galigeo.socialtrendsr.Config.java");
            System.exit(-1);
        }
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey(Config.TWITTER_CONSUMERKEY)
            .setOAuthConsumerSecret(Config.TWITTER_CONSUMERSECRET)
            .setOAuthAccessToken(Config.TWITTER_ACCESSTOKEN)
            .setOAuthAccessTokenSecret(Config.TWITTER_ACCESSTOKENSECRET);

        StatusListener listener = new StatusListener(){
            public void onStatus(Status status) {
                Tweet tweet = TweetParser.parse(status);
                //if (tweet.hasCoordinates() && (tweet.fromInstagam || tweet.fromSwarm)){
                if (tweet.isFoursquare){
	                System.out.println(tweet);     
	                //System.out.println("status: " + new Gson().toJson(status));
	                String shortId = tweet.fullURL.replace("swarmapp.com/c/", "");
	                //System.out.println("Checkin Short ID: " + shortId);
	                Checkin checkin = CheckInResolver.resolveCheckin(shortId);
	                System.out.println("venue: " + new Gson().toJson(checkin.venue));
	                
	                //System.out.println("    place: " + status.getPlace().toString());
	                //System.out.println("    scopes places ids: " + status.getScopes().getPlaceIds());
                } else if (tweet.hasCoordinates()) {
                	System.out.println(tweet);	                
                }
            }

            // todo: Delete these tweets.
            public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
                System.out.println("Got a status deletion notice id:" + statusDeletionNotice.getStatusId());
            }

            public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
                System.out.println("Got track limitation notice:" + numberOfLimitedStatuses);
            }

            public void onScrubGeo(long userId, long upToStatusId) {
                System.out.println("Got scrub_geo event userId:" + userId + " upToStatusId:" + upToStatusId);
            }

            public void onStallWarning(StallWarning warning) {
                System.out.println("Got stall warning:" + warning);
            }

            public void onException(Exception ex) {
                ex.printStackTrace();
            }
        };
        // NW: 48.927629, 2.228708
        // SE: 48.805674, 2.439508
        /*
        double [] NE = {2.463198,48.910934};
        double [] SW = {2.233858, 48.814266};
        double [][] locations ={SW, NE};
        String [] keywords = new String[]{"swarm", "instagram"};
        */
        TwitterStream twitterStream = new TwitterStreamFactory(cb.build()).getInstance();
        twitterStream.addListener(listener);
        FilterQuery tweetFilterQuery = new FilterQuery();
        tweetFilterQuery.locations(Config.LOCATIONS);//.track(keywords);
        //tweetFilterQuery.track(keywords);
        //twitterStream.filter(new FilterQuery().locations(locations));
        twitterStream.filter(tweetFilterQuery);
    }
}
