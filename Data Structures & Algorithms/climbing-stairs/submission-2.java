class Solution {
    public int climbStairs(int n) {
        return countSteps(n, new HashMap<>());        
    }
    static int countSteps(int n, Map<Integer, Integer> dp) {
        
        if(n==1) return 1;
        if(n==2) return 2;
        if(dp.containsKey(n)) return dp.get(n);

        int count = countSteps(n-1, dp) + countSteps(n-2, dp);
        dp.put(n, count);
        return count;
    }
}
