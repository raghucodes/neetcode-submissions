class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0;
        int result=0;
        int n = nums.length;
        for(int i=0;i<n;i++) {
            sum += nums[i];

            if(hm.containsKey(sum-k)) {
                result += hm.get(sum-k);
            }

            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return result;
    }
}