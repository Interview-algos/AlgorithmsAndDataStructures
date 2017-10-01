package srihari;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Votes {

	public static void main(String[] args) {
		String[] votes = {"a","b","c","a"};
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < votes.length; i++) {
			if (map.containsKey(votes[i])) {
				map.put(votes[i], map.get(votes[i]) + 1);
			} else {
				map.put(votes[i], 1);
			}
		}
		
		for (String key: map.keySet()) {
			List<String> maxVotes = new ArrayList<String>();
			int maxVal = map.get(key);
			if (map.get(key) > maxVal) {
				
			}
			
			
		}
		
	}
}
