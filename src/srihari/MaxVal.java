package srihari;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;


public class MaxVal {
	public static void main(String[] args)
    {
        HashMap<String,Integer>map=new HashMap<String, Integer>();
        map.put("sree", 50);
        map.put("sree", 60);
        map.put("a", 30);
        map.put("b", 60);
        map.put("c", 60);
        int maxValueInMap=(Collections.max(map.values()));  
        
        // This will return max value in the Hashmap
        
        String[] matchingVotes = new String[10];
        int i =0;
        for (Entry<String, Integer> entry : map.entrySet()) {  // Itrate through hashmap
            if (entry.getValue()==maxValueInMap) {
                //System.out.println(entry.getKey());     // Print the key with max value
                matchingVotes[i] = entry.getKey();
                i++;
            }
        }
        
        
        if (matchingVotes.length == 1) {
        //	System.out.println(matchingVotes.get(0));
		} else {
			Arrays.sort(matchingVotes);
		}

    }
}
