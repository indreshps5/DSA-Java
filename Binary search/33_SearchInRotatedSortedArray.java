class Solution {
    public int search(int[] nums, int target) {
        
        int fi=0, la=nums.length-1,i=fi+(la-fi)/2;

        if(nums[i]>=nums[fi] && nums[i]<=nums[la]){
            while(fi<=la){
                    int mid=fi+(la-fi)/2;
                    if(nums[mid]==target){
                        
                        return mid;
                    }
                    else if(target<nums[mid]){
                        la=mid-1;
                    }
                    else{
                        fi=mid+1;
                    }
                }
                return -1;
        }
        else if(nums[i]<=nums[fi]&& nums[i]>=nums[la]){
            while(fi<=la){
                    int mid=fi+(la-fi)/2;
                    if(nums[mid]==target){
                        
                        return mid;
                    }
                    else if(target<nums[mid]){
                        fi=mid+1;
                    }
                    else{
                        la= mid-1;
                    }
                }
                return -1;
        }

         index(nums,target, fi, la);

         return nums[0];
        
    }

    public void index(int [] nums, int target, int fi, int la){
        if(la<fi){
            nums[0]=-1;
            return;
        }

        int i=fi+(la-fi)/2;
        if(target==nums[i]){
            nums[0]=i;
            return;
        }
        if(fi==i&&i==la){
            nums[0]=-1;
            return;
        }
        if(nums[i]>nums[la]){
            if(target<nums[i]&&target>=nums[fi]){
                while(fi<=i){
                    int mid=fi+(i-fi)/2;
                    if(nums[mid]==target){
                        nums[0]=mid;
                        return;
                    }
                    else if(target<nums[mid]){
                        i=mid-1;
                    }
                    else{
                        fi=mid+1;
                    }
                }
                nums[0]=-1;
                
            }
            else{
                index(nums,target,i+1, la);
            }
        }

        else{
            if(target>nums[i]&&target<=nums[la]){

                while(i<=la){
                    int mid=i+(la-i)/2;
                    if(nums[mid]==target){
                        nums[0]=mid;
                        return;
                    }
                    else if(target<nums[mid]){
                        la=mid-1;
                    }
                    else{
                        i=mid+1;
                    }
                }

                nums[0]=-1;
            }
            else{
                index(nums, target, fi,i-1);
            }
        }
        return ;
    }
}