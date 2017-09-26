package nihar;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
 
class FindDuplicateCharactersInString
{
    static void duplicateCharCount(String inputString)
    {
 
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
 
        char[] strArray = inputString.toCharArray();
 
        for (char c : strArray)
        {
            if(hm.containsKey(c))
            {
                hm.put(c, hm.get(c)+1);
            }
            else
            {
                hm.put(c, 1);
            }
        }
        for (Entry<Character, Integer> m: hm.entrySet()){
        	if (m.getValue()>1){
        		System.out.println(m.getKey() + " " + m.getValue());
        	}
        }
    }
 
    public static void main(String[] args)
    {
       duplicateCharCount("JavaJ2EE");
 
       duplicateCharCount("Fresh Fish");
 
       duplicateCharCount("Better Butter");
    }
}
