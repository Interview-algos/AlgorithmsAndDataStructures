package regexpkg;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class MyFileExtenValidation {
 
	//private static Pattern fileExtnPtrn = Pattern.compile("([^\\s]+(\\.(?i)(txt|doc|csv|pdf))$)");
	//private static Pattern fileExtnPtrn = Pattern.compile("(.*)\\.(txt|doc|csv|pdf)");
	private static Pattern fileExtnPtrn = Pattern.compile("(.*)(\\.){1}(txt|doc|csv|pdf)");
     
    public static boolean validateFileExtn(String fileName){
         
        Matcher mtch = fileExtnPtrn.matcher(fileName);
        if(mtch.matches()){
            return true;
        }
        return false;
    }
     
    public static void main(String a[]){
        System.out.println("Is 'java2novice.pdf' allowed file? "
                        +validateFileExtn("java2novice.pdf"));
        System.out.println("Is 'cric.doc' allowed file? "
                        +validateFileExtn("cric.doc"));
        System.out.println("Is 'java.gif' allowed file? "
                        +validateFileExtn("java.gif"));
        System.out.println("Is 'novice.mp3' allowed file? "
                        +validateFileExtn("novice.mp3"));
        System.out.println("Is 'java_2.jpeg' allowed file? "
                        +validateFileExtn("java_2.jpeg"));
    }
}
