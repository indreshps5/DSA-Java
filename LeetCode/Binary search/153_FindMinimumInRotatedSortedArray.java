class Solution {
    public int findMin(int[] nums) {
        int fi=0, la= nums.length-1, min=Integer.MAX_VALUE;

        while(fi<=la){
            int mid=fi+(la-fi)/2;
            if(nums[fi]<=nums[mid]&&nums[mid]<=nums[la]){
                min= Math.min(min,nums[fi]);
                break;
            }
            else if(nums[mid]>nums[la]){
                fi=mid+1;
            }
            else if(nums[mid]<nums[la]){
                min=Math.min(min, nums[mid]);
                la=mid-1;
            }
        }

        return min;
    }
}