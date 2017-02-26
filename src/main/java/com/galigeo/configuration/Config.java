package com.galigeo.configuration;

import java.util.Arrays;
import java.util.List;

import com.galigeo.spatial.geometry.Coordinates;

/**
 * Global configurations.
 */
public class Config {
    public static String TWITTER_CONSUMERKEY 		= "xIUCj8xiWY8Z3ZQYr7kYNg";
    public static String TWITTER_CONSUMERSECRET 	= "aTYFhWsQIr9XZpZOX5AdleXnWoQepYeVenXFxS0gU";
    public static String TWITTER_ACCESSTOKEN 		= "170604186-tmt02TSsFIXVpz7VzM7ntqzfABmXzEXOoY5sdD0U";
    public static String TWITTER_ACCESSTOKENSECRET 	= "G9Mkl95js7HwlVPus6B6wB9hI1V4Y5BGwJFpFuif1Oo";
    
    public static String FOURSQUARE_CLIENTID			= "EVP5KTFBE4REIEZGMS1CE51CFO20U5UOSFBLDVW3UPPWEBIT";
    public static String FOURSQUARE_CLIENTSECRET		= "HKL20CW4XQZSJUYUUAISYXSBJQL4JNCDKKFR0HPKSPSSN3S4";
    public static String FOURSQUARE_CHECKIN_RESOLVE_URL = "https://api.foursquare.com/v2/checkins/resolve?shortId={CHECKIN_SHORTID}&v=20170212&&client_id={CLIENT_ID}&client_secret={CLIENT_SECRET}";

    public static List<String> twitter_usersToIgnore = Arrays.asList(
            "trendinaliaDE",
            "pairsonnalitesD",
            "ptext",
            "ssbot",
            "_BB_RADIO_MUSIC",
            "RadioTeddyMusic",
            "030_Berlin",
            "trendinaliaFR"
    );
    
    // Paris bounding box
    public static double [] NE = {2.463198,48.910934};
    public static double [] SW = {2.233858, 48.814266};
    public static double [][] LOCATIONS ={SW, NE};
    public static Coordinates PARIS_NE = new Coordinates(NE[1], NE[0]);
    public static Coordinates PARIS_SW = new Coordinates(SW[1], SW[0]);
    public static Coordinates[] PARIS_BOUNDS = {PARIS_NE, PARIS_SW};
}
