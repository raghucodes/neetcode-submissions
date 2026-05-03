class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
        }

        int n = nums.length;
        int max = 0;
        for(int i=0;i<n;i++) {
            int length = 0;
             if(!hs.contains(nums[i]-1)) {
                while(hs.contains(nums[i] + length)) {
                    length += 1;
                    max = Math.max(max,length);
                }
             }
        }

        return max;
    }
}
