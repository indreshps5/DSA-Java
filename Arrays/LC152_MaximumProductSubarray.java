class Solution {
    public int maxProduct(int[] nums) {
        int pro=1,max=Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                pro=pro*nums[j];
                max= Math.max(max, pro);
            }
            pro=1;
        }

        return max;
    }
}