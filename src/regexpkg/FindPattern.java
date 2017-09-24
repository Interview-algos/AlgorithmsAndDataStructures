package regexpkg;
import java.util.regex.Matcher ;
import java.util.regex.Pattern;

public class FindPattern {
	
	public static void main(String args[]){
	find("1001110110001");
	System.out.println("-------------");
	find("1101001");
	System.out.println("-------------");
	find("100001abc101");
	
	}

	
	public static void find(String str){
		
		int count = 0;
		Pattern p = Pattern.compile("10+1");
		Matcher m = p.matcher(str);
		while(m.find()){
			System.out.println("Start of the Index=>" + m.start());
			System.out.println("End of the Index=>" + (m.end()-1));
			m.region(m.end()-1, str.length());
			count++;
			
			
		}
		System.out.println("count :" + count);
		
	}
}
