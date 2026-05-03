class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];

        prefixSum[0] = nums[0];
        for(int i=1;i<n;i++) {
            prefixSum[i] = prefixSum[i-1]*nums[i];
        }

        suffixSum[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--) {
            suffixSum[i] = suffixSum[i+1] * nums[i];
        }

        int result[] = new int[n];
        for(int i=0;i<n;i++) {
            if(i == 0) {
                result[i] = suffixSum[1];
            } else if(i == n-1) {
                result[i] = prefixSum[n-2];
            } else {
                result[i] = prefixSum[i-1] * suffixSum[i+1];
            }
        }
        return result;
    }
}  
