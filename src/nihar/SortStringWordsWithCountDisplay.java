package nihar;

import java.util.TreeMap;
import java.util.Map.Entry;

public class SortStringWordsWithCountDisplay {

	/**
	 * @param args
	 */
	

	public static void stringSort(String str){
		
		String[] arr = str.split(" ");
		
		
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		
		for (int i=0;i<arr.length; i++){
			
			if (!tm.containsKey(arr[i])){
				tm.put(arr[i], 1);
			}else{
				tm.put(arr[i], tm.get(arr[i])+1);
			}
		}

		for (Entry m: tm.entrySet()){
			
			System.out.println(m.getKey() + " - " + m.getValue());
				
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		stringSort("testing the test is a difficult test");
	}

}
