class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[i+1]){
                break;
            }
            i+=2;
        }

        return nums[i];
    }
}