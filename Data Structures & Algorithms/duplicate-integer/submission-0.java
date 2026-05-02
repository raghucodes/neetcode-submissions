class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(!hm.containsKey(nums[i])) {
                hm.put(nums[i],1);
            } else {
                return true;
            }
        }
        return false;
    }
}