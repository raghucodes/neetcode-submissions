class Solution {
    public int maxArea(int[] heights) {
        
        int n = heights.length;
        int start = 0;
        int end = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(start<end) {
            int height = Math.min(heights[start], heights[end]);
            int width = end - start;
            water = Math.max(water, height*width);

            if(heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }
        return water;
    }
}
