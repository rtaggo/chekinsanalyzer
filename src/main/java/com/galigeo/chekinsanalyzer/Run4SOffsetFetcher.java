package com.galigeo.chekinsanalyzer;

import com.galigeo.fetcher.foursquare.FoursquareOffSetFetcher;

public class Run4SOffsetFetcher {
	 public static void main( String[] args ) {
        System.out.println( "Run Foursquare OffSet Fetcher" );
        FoursquareOffSetFetcher iF = new FoursquareOffSetFetcher("Foursquare");
		iF.forwardFetching();
	 }
}
