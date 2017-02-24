package com.galigeo.model.foursquare.core;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.google.gson.Gson;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class FoursquareCoreTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public FoursquareCoreTest(String testName) {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(FoursquareCoreTest.class);
    }
    
    public void testResolveResponse() {
    	String response = "{\"meta\":{\"code\":200,\"requestId\":\"58b0b2f4db04f5103a0e4ce1\"},\"response\":{\"checkin\":{\"id\":\"58a07f23d32b440d4a4337a2\",\"createdAt\":1486913315,\"type\":\"checkin\",\"entities\":[],\"shout\":\"Best pastries in Paris ..\",\"timeZoneOffset\":60,\"user\":{\"id\":\"13838046\",\"firstName\":\"Nyphoon\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/13838046-IVJ4LRZE2AM5FXKW.jpg\"}},\"venue\":{\"id\":\"4b8bdd91f964a52060af32e3\",\"name\":\"Angelina\",\"contact\":{\"phone\":\"+33140682250\",\"formattedPhone\":\"+33 1 40 68 22 50\"},\"location\":{\"address\":\"Palais des Congrès\",\"lat\":48.879825218148426,\"lng\":2.2831404632594277,\"labeledLatLngs\":[{\"label\":\"display\",\"lat\":48.879825218148426,\"lng\":2.2831404632594277}],\"postalCode\":\"75017\",\"cc\":\"FR\",\"city\":\"Paris\",\"state\":\"Île-de-France\",\"country\":\"France\",\"formattedAddress\":[\"Palais des Congrès\",\"75017 Paris\",\"France\"]},\"categories\":[{\"id\":\"4bf58dd8d48988d1dc931735\",\"name\":\"Salon de thé\",\"pluralName\":\"Salons de thé\",\"shortName\":\"Salon de thé\",\"icon\":{\"prefix\":\"https://ss3.4sqi.net/img/categories_v2/food/tearoom_\",\"suffix\":\".png\"},\"primary\":true}],\"verified\":false,\"stats\":{\"checkinsCount\":617,\"usersCount\":472,\"tipCount\":17},\"url\":\"http://www.angelina-paris.fr/fr/content/24-palais-des-congres\",\"menu\":{\"type\":\"Menu\",\"label\":\"Menu\",\"anchor\":\"Afficher le menu\",\"url\":\"http://angelina-paris.fr/img/cms/CARTE%20MAILLOT%20PE16.pdf\",\"mobileUrl\":\"http://angelina-paris.fr/img/cms/CARTE%20MAILLOT%20PE16.pdf\",\"externalUrl\":\"http://angelina-paris.fr/img/cms/CARTE%20MAILLOT%20PE16.pdf\"},\"allowMenuUrlEdit\":true,\"beenHere\":{\"lastCheckinExpiredAt\":0}},\"source\":{\"name\":\"Swarm for iOS\",\"url\":\"https://www.swarmapp.com\"},\"photos\":{\"count\":1,\"items\":[{\"id\":\"58a07f25e6160c5d3bc4c0ab\",\"createdAt\":1486913317,\"prefix\":\"https://igx.4sqi.net/img/general/\",\"suffix\":\"/13838046_C2OQSuyyVzUIpsTDMgcz01bTGylPXg1XO_Ts3m4TaBI.jpg\",\"width\":1440,\"height\":1920,\"user\":{\"id\":\"13838046\",\"firstName\":\"Nyphoon\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/13838046-IVJ4LRZE2AM5FXKW.jpg\"}},\"visibility\":\"public\"}],\"layout\":{\"name\":\"single\"}},\"likes\":{\"count\":4,\"groups\":[{\"type\":\"others\",\"count\":4,\"items\":[{\"id\":\"6552992\",\"firstName\":\"Ali\",\"lastName\":\"G.\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/6552992-XLLLXKJ3OSXWYJN0.jpg\"}},{\"id\":\"41583915\",\"firstName\":\"Mohammed\",\"lastName\":\"SAG\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/41583915-CKIHU4FQ2L25EVFW.jpg\"}},{\"id\":\"69525087\",\"firstName\":\"Abdulrahman\",\"lastName\":\"Bin Muammar\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/69525087-MBIWNU1EDDS4EKHK.jpg\"}},{\"id\":\"76911652\",\"firstName\":\"وَسّــِيْع البِنَايدَ\",\"gender\":\"male\",\"photo\":{\"prefix\":\"https://igx.4sqi.net/img/user/\",\"suffix\":\"/76911652_6xhpHcxe_fa84GcxUzyg9JgJifaSSpH0HyWbi9u2pP5V5TOCIQDD39Ab1JDP53yG1xCkYtd9f.jpg\"}}]}],\"summary\":\"4 personnes aiment\"},\"sticker\":{\"id\":\"52a659800000000000000006\",\"name\":\"Joey Beans\",\"image\":{\"prefix\":\"https://irs0.4sqi.net/img/sticker/\",\"sizes\":[60,94,150,300],\"name\":\"/coffee_f4b66b.png\"},\"stickerType\":\"unlockable\",\"group\":{\"name\":\"collectible\",\"index\":9},\"pickerPosition\":{\"page\":0,\"index\":9},\"teaseText\":\"Publie un check-in dans des Coffee Shops pour débloquer cet autocollant.\",\"unlockText\":\"A obtenu cet autocollant à Coffee Shops\",\"bonusText\":\"À utiliser dans les Coffee Shops pour bénéficier d'une offre spéciale.\",\"points\":2,\"bonusStatus\":\"Utilisation limitée à une fois par semaine. Rechargement ce dimanche à minuit.\"},\"isMayor\":false,\"score\":{\"total\":23,\"scores\":[{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_magnify.png\",\"message\":\"Premier check-in à Angelina.\",\"points\":5},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_clock.png\",\"message\":\"Premier check-in « Salon de thé » en un an !\",\"points\":5},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_photo.png\",\"message\":\"Super photo !\",\"points\":5},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_magnify.png\",\"message\":\"Premier de tes amis à publier un check-in à Angelina.\",\"points\":2},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_magnify.png\",\"message\":\"De retour en Ternes.\",\"points\":2},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_streak.png\",\"message\":\"1 check-in publié à Palais des congrès de Paris.\",\"points\":2},{\"icon\":\"https://ss1.4sqi.net/img/points/coin_icon_sharing.png\",\"message\":\"Partager c'est la vie !\",\"points\":2}]},\"reasonCannotSeeComments\":\"loggedout\",\"reasonCannotAddComments\":\"loggedout\"},\"signature\":\"yDpoI8rWIgr5pgSZbjam1V5rd_8\"}}";
    	try {
	    	ObjectMapper mapper = new ObjectMapper();
			ResolveResponse resolveResp = mapper.readValue(response, ResolveResponse.class);
			assertEquals(200, resolveResp.meta.code);
			Checkin checkin = resolveResp.response.checkin;
			assertEquals("checkin", checkin.type);
			System.out.println("Parsed checkin: " + new Gson().toJson(checkin));
    	} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
}
