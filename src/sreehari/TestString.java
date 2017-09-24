package sreehari;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestString {

	public static List<String> getAllMatches(String text, String regex) {
		
		
        List<String> matches = new ArrayList<String>();
        Matcher m = Pattern.compile("(?=(" + regex + "))").matcher(text);
        while(m.find()) {
            matches.add(m.group(1));
        }
        return matches;
    }

    public static void main(String[] args) {
        System.out.println(getAllMatches("w::/a\b", "([a-z][a-z0-9:]*/[a-z0-9]+\\[a-z]+)"));
        System.out.println(getAllMatches("abaa", "a.*a"));
    }
}
