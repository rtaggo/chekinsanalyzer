package com.galigeo.chekinsanalyzer;

import com.galigeo.fetcher.twitter.TwitterStreamingFetcher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Check-In Crawler from Swarm App tweet" );
        new TwitterStreamingFetcher();
    }
}
