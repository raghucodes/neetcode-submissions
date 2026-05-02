class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> hmSource = new HashMap<>();
        HashMap<Character, Integer> hmTarget = new HashMap<>();

        int m = s.length();
        int n = t.length();

        if(m != n) {
            return false;
        }
        for(int i=0;i<m;i++) {
            if(hmSource.containsKey(s.charAt(i))) {
                hmSource.put(s.charAt(i), hmSource.get(s.charAt(i))+1);
            } else {
                hmSource.put(s.charAt(i),1);
            }

            if(hmTarget.containsKey(t.charAt(i))) {
                hmTarget.put(t.charAt(i), hmTarget.get(t.charAt(i))+1);
            } else {
                hmTarget.put(t.charAt(i),1);
            }
        }

        // for(int i=0;i<m;i++) {
        //     if(!hmTarget.containsKey(s.charAt(i))) {
        //         return false;
        //     }
        //     if(hmSource.get(s.charAt(i)) != hmTarget.get(s.charAt(i))) {
        //         return false;
        //     }
        // }
        
        return hmSource.equals(hmTarget);
    }
}
