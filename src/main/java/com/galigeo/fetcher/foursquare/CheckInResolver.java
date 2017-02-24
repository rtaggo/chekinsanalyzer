package com.galigeo.fetcher.foursquare;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Calendar;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.galigeo.configuration.Config;
import com.galigeo.model.foursquare.core.Checkin;
import com.galigeo.model.foursquare.core.ResolveResponse;

public class CheckInResolver {
	public static Checkin resolveCheckin(String shortId){
		System.out.println(Calendar.getInstance().getTime() + " -- Resolving : checkin id=" + shortId);
		try {
			URL url = new URL(buildResolveQuery(shortId));
			URLConnection connection = url.openConnection();
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(10000);
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String response = "";
			String line;
			while ((line = in.readLine()) != null) {
				response = response + line + "\n";
			}
			in.close();
			//System.out.println("Resolve response:" + response);
			ObjectMapper mapper = new ObjectMapper();
			ResolveResponse resolveResp = mapper.readValue(response, ResolveResponse.class);
			return resolveResp.response.checkin;
		} catch (SocketTimeoutException ste) {
            System.out.println("\tTimeout!");
        } catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static String buildResolveQuery(String shortId) {
		String result = "https://api.foursquare.com/v2/checkins/resolve"
				+ "?shortId=" + shortId 
				+ "&client_id="+Config.FOURSQUARE_CLIENTID
                + "&client_secret="+Config.FOURSQUARE_CLIENTSECRET
                + "&v=20170212";
        return result;
	}
}
