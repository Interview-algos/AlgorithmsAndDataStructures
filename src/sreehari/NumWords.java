package sreehari;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumWords {

	public static void main(String[] args) {
		String s = "Sree hari asas asss asas";
		
		String[] words = s.split(" ");
		SortedSet<String> myset = new TreeSet<String>();
		for (int i = 0; i < words.length; i++) {
			myset.add(words[i]);
		}
		
		
		Iterator<String> sree = myset.iterator();
		
		while (sree.hasNext()) {
			System.out.println(sree.next());
		}
	}
}
