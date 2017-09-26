package stringpkg;

import java.util.HashSet;

/**
 * Given a string, find the length of the longest substring without repeating
 * characters. For example, the longest substring without repeating letters for
 * "abcabcbb" is "abc", which the length is 3. For "bbbbb" the longest substring
 * is "b", with the length of 1.
 * 
 * 
 * @author rkumar1
 *
 */

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		String s = "abccdefghiijj";
		System.out.println("Max length: " + lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null || s.length() == 0)
			return 0;

		HashSet<Character> set = new HashSet<Character>();

		int max = 0;

		int i = 0;
		int start = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			if (!set.contains(c)) {
				set.add(c);
			} else {
				max = Math.max(max, set.size());

				while (start < i && s.charAt(start) != c) {
					set.remove(s.charAt(start));
					start++;
				}
				start++;
			}

			i++;
		}

		max = Math.max(max, set.size());

		return max;
	}

}
