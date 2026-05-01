class Solution {
    public int reverseBits(int n) {
        int temp = 0;
        int result = 0;
        for(int i=0;i<32;i++) {
            temp = (n >> i) & 1;
            result |= temp << (31-i);
        }
        return result;
    }
}
