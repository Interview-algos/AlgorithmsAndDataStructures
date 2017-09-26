package nihar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 *Converting HashMap into ArrayList in Java
 */
public class MapToListJava {

    public static void main(String... args) {
    	
        HashMap<String, String> personalLoanOffers = new HashMap<String, String>();
        // preparing hashmap with keys and values
        personalLoanOffers.put("personal loan by DBS", "Interest rate low");
        personalLoanOffers.put("personal loan by Standard Charted", "Interest rate low");
        personalLoanOffers.put("HSBC personal loan by DBS", "14%");
        personalLoanOffers.put("Bankd of America Personal loan", "11%");
      
        System.out.println("Size of personalLoanOffers Map: " + personalLoanOffers.size());
      
        //Converting HashMap keys into ArrayList
        List<String> keyList = new ArrayList<String>(personalLoanOffers.keySet());
        System.out.println("Size of Key list from Map: " + keyList.size());
      
        //Converting HashMap Values into ArrayList
        List<String> valueList = new ArrayList<String>(personalLoanOffers.values());
        System.out.println("Size of Value list from Map: " + valueList.size());
      
        List<Entry> entryList = new ArrayList<Entry>(personalLoanOffers.entrySet());
        System.out.println("Size of Entry list from Map: " + entryList.size());
        for (Entry m: entryList){
        	System.out.println(m.getKey() + " " + m.getValue());
        }
        
        String s1 = new String("Nihar");
        String s2 = new String ("Nihar");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

    }
}

