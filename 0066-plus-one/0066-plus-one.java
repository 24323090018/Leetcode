class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i=len-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i] += 1;
                break;
            }else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int[] res = new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}