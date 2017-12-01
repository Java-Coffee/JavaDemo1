
//Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
//        Example:
//
//        Input: “babadab”
//
//        Output: “bab”
//        Note: “aba” is also a valid answer.
//        Example:
//        Input: “cbbd”
//
//        Output: “bb”

import java.util.HashMap;
import java.util.Map;

public class logic_day3 {
    public static void main(String[] args) {
        String s = getLongestSubString("abcbadac");
        System.out.println("s = "+s);
    }

    public static String getLongestSubString(String s){
        int slen = s.length();
        int indexS = 0;
        int beginS = 0;
        int indexD = 0;
        int beginD = 0;
        for(int i = 0;i < slen;i++){
            int left = i-1,right = i;
            while (left >= 0 &&right <slen&&(s.charAt(left) == s.charAt(right))){
                left--;
                right++;
            }

            if(right-left-1 > indexS){
                indexS = right-left-1;
                beginS = left+1;
            }

            left = i-1;right = i+1;
            while (left >= 0 &&right <slen&&(s.charAt(left) == s.charAt(right))){
                left--;
                right++;
            }

            if(right-left-1 > indexD){
                indexD = right-left-1;
                beginD = left+1;
            }

        }
        return beginS>beginD?s.substring(beginS,beginS+indexS):s.substring(beginD,beginD+indexD);
    }
}
