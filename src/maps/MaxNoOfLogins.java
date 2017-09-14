package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/* Given a file (which can be considered as a String with comma delimiter for the complexity of the question) 
 * of usernames and a value k, find top k usernames (with number of logins) who logged into the system the most. 
 */


public class MaxNoOfLogins {
	
	public static void main(String[] args) {
		String users = "user1,user4,user2,user1,user3,user1,user2,user3"; 
		countLogins(users);
		
	}
	
	
	public static void countLogins(String users){
		
		String usersList[] = users.split(",");
		HashMap<String, Integer> loginCounts = new HashMap<String, Integer>();
		
		for(int i=0; i< usersList.length;i++ ){
			System.out.println(usersList[i]);
		}
		
		
		for(String user: usersList){
			
			if(loginCounts.containsKey(user)){
				loginCounts.put(user, loginCounts.get(user) + 1);
			}
			
			else{
				
				loginCounts.put(user, 1);
			}
			
		}
		
		
		Iterator<Entry<String,Integer>> itr = loginCounts.entrySet().iterator();
		Set<Entry<String,Integer>> entries = loginCounts.entrySet();
		
		for(Entry<String,Integer> ent : entries){
			System.out.println(ent.getKey() + "=>" +ent.getValue());
		}
		
		
	}

}
 