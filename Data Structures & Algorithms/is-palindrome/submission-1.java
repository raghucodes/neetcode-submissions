class Solution {
    public boolean isPalindrome(String s) {
        
        int l = 0;
        String str = "";

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                str += c;
            }
        }
        str = str.toLowerCase();
        int r = str.length()-1;

        while(l<r) {
             if(str.charAt(l) != str.charAt(r)) {
                return false;
            } else {
                l++;
                r--;
            }
        }
        return true;
    }
}
