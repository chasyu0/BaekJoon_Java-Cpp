import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int First = 0;
        int Last = 0;
        int maxLen = 0; // 최대 길이

        while(Last < s.length()) {
            if(!set.contains(s.charAt(Last))) {
                set.add(s.charAt(Last));
                Last++;
                maxLen = Math.max(maxLen, Last - First);
            } else {
                set.remove(s.charAt(First));
                First++;
            }
        }
        return maxLen;
    }
}