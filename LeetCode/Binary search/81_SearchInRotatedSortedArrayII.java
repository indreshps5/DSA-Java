class Solution {
    public boolean search(int[] nums, int target) {
        int fi=0, la=nums.length-1;
        while(fi<=la){
            int mid=fi+(la-fi)/2;
            if(nums[mid]==target){
                return true;
            }
            if(fi==la&&la==mid) {
                break;
            }
            else if(nums[mid]==nums[la]&&nums[mid]==nums[fi]){

                fi=fi+1;
                la=la-1;
            }
            else if(nums[mid]>nums[la]){
                if(target>=nums[fi]&&target<nums[mid]){
                    la=mid-1;
                }
                else{
                    fi=mid+1;
                }
            }
            else if(nums[mid]<=nums[la]){
                if(target>nums[mid]&&target<=nums[la]){
                    fi=mid+1;
                }
                else{
                    la=mid-1;
                }
            }
        }

        return false;
    }
}