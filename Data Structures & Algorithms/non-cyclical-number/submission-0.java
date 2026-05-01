class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        return isHappyNumber(n, hs);
    }

    static boolean isHappyNumber(int n, HashSet<Integer> hs) {
        if(n == 1) return true;
        if(hs.contains(n)) return false;
        hs.add(n);
        int sum = 0;
        while(n>0) {
            int a = n%10;
            sum += a*a;
            n = n/10;
        }
        return isHappyNumber(sum,hs);
    }
}
