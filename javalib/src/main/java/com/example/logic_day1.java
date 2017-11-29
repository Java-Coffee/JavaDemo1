
//Given a string, find the length of the longest substring without repeating characters.
//        Examples:
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//        Given "bbbbb", the answer is "b", with the length of 1.
//        Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring , "pwke" is a subsequence and not a substring.

import java.util.HashMap;
import java.util.Map;

public class logic_day1 {
    public static void main(String[] args) {
        lengthOfLongestSubstring("aabcadacd");

    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        System.out.print("length of '"+s+"' = "+ans);
        return ans;
    }
}
