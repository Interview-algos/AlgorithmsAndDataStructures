
 /**i/p :AABBBDDCCCCEEEEE
  * Rseult  :A2B3D2C4E5
  */
package stringpkg;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringEncoding {

		public static void main(String[] args) {
			String str = "AABBBCCCCDDEEEEE" ;
			encode(str);
		}
		
		public static void encode(String str){
			
			char[] a = str.toCharArray();
			LinkedHashMap<Character,Integer> hm = new LinkedHashMap<Character,Integer>();
			
			
			for(int i=0; i< a.length;i++){
				
				if(hm.containsKey(a[i])){		
					hm.put(a[i], hm.get(a[i])+1);
				}
				
				else{
					hm.put(a[i], 1);
				}
			}
			
			Set<Entry<Character,Integer>>  entryset = hm.entrySet();
			StringBuilder strbuilder = new StringBuilder();
			for(Entry e : entryset){
				
				System.out.println(e.getKey() + "=>" + e.getValue());
				strbuilder.append(e.getKey()).append(e.getValue());
				
			}
			
			System.out.println(strbuilder);
			
		}
		
	
}
