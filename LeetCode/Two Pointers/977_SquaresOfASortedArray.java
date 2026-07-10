class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j;
        int arr[]= new int [nums.length];
        while(i<nums.length){
            if(nums[i]>=0){
                break;
            }
            i++;
        }
            j=i-1;
            int k=0;
            while(j>=0||i<nums.length){
                if(j>=0&&i<nums.length){
                    if(nums[i]*nums[i]<nums[j]*nums[j]){
                        arr[k]=nums[i]*nums[i];
                        k++;
                        i++;
                    }
                    else{
                        arr[k]=nums[j]*nums[j];
                        k++;
                        j--;
                    }
                }
                else if(i<nums.length){
                    arr[k]=nums[i]*nums[i];
                    k++;
                    i++;

                }
                else{
                    arr[k]=nums[j]*nums[j];
                    k++;
                    j--;
                }
            }
            return arr;
        }
    }