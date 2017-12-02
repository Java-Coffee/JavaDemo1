
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



public class logic_day3 {
    public static void main(String[] args) {
        //String s = getLongestSubString("abcbadac");
        //System.out.println("s = "+s);
        int len = getLongestSubString1("abcbadac");
        System.out.println("len = "+len);
    }

    //判断当前字母的左右是否相等
    public static String getLongestSubString(String s){
        int slen = s.length();
        int indexS = 0;
        int beginS = 0;
        int indexD = 0;
        int beginD = 0;
        for(int i = 0;i < slen;i++){

            //回文子串是偶数的情况
            int left = i-1,right = i;
            while (left >= 0 &&right <slen&&(s.charAt(left) == s.charAt(right))){
                left--;
                right++;
            }

            if(right-left-1 > indexS){
                indexS = right-left-1;
                beginS = left+1;
            }

            //回文子串是奇数的情况
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

    public static int getLongestSubString1(String s){
        String subS = "";
        String t = "cadabcba";
        int len = s.length();
        int longest = 0;
        for(int i = 0;i<len-1;i++){
            for(int j = len-1;j>i;j--){
                subS = t.substring(i,j);
                if(s.contains(subS)){
                    System.out.println("subS = "+subS);
                    longest = Math.max(longest,j-i+1);
                }
            }
        }
        return longest;
    }
}
