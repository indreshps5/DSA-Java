class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int [nums1.length];

        for(int i=0; i<nums1.length;i++){
            ans[i]=nextGreater(nums1[i], nums2);
        }

        return ans;
        
    }

    public int nextGreater(int val, int arr[]){

        for(int i=0;i<arr.length;i++){

            if(arr[i]==val){
                int j=i+1;
                while(j<arr.length){
                    if(arr[j]>arr[i]){
                        return arr[j];
                    }
                    j++;

                }
                break;
            }
        }

        return -1;
    }
}