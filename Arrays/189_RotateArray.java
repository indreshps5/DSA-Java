class Solution {
    public void rotate(int[] nums, int k) {
        int r=k% nums.length;
        int j=0;
        int arr[]= new int[nums.length];
        for(int i=nums.length-r; i<nums.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-r;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0; i<nums.length; i++){
            nums[i]=arr[i];
        }
    }
}