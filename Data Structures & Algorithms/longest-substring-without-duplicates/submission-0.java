class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        int n = s.length();
        int start = 0;
        int end = 0;
        while(end < n) {
            if(!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                end++;
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
            max = Math.max(max, hs.size());
        }
        return max;
    }
}
