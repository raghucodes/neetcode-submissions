class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;
        int[] result = new int[n];
        for(int i = n-1; i>=0; i--) {
            int newNum = digits[i]+carry;
            if(newNum > 9) {
                result[i] = newNum%10;
                carry = newNum/10;
            } else {
                result[i] = newNum;
                carry = 0;
            }
        }

        if(carry>0) {
            int[] newResult = new int[n+1];
            newResult[0] = carry;
            for(int i=1;i<n;i++) {
                newResult[i] = result[i];
            }
            return newResult;
        }
        return result;
    }
}
