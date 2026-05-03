class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
        int start = 0;
        int end = 0;
        int maxFreq = 0;
        int n = s.length();
        int result = 0;

        while(end < n) {
            if(freqMap.containsKey(s.charAt(end))) {
                freqMap.put(s.charAt(end), freqMap.get(s.charAt(end))+1);
            } else {
                freqMap.put(s.charAt(end), 1);
            }
            maxFreq = Math.max(maxFreq, freqMap.get(s.charAt(end)));
            if((end-start+1) - maxFreq > k) {
                if(freqMap.get(s.charAt(start)) > 1) {
                    freqMap.put(s.charAt(start), freqMap.get(s.charAt(start)) - 1);
                } else {
                    freqMap.remove(s.charAt(start));
                }
                start++;
            }
            end++;
            result = Math.max(result, (end-start));
        }        
        return result;
    }
}
