class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> list= new ArrayList<>();
        int arr[]= new int[Math.min(nums1.length,nums2.length)];
        int k=0;
        if(nums1.length<nums2.length){
          //  int arr[]= new int[nums1.length];
            
            for(int i=0; i<nums2.length; i++){
                list.add(nums2[i]);
            }
            for(int i=0; i<nums1.length; i++){
                if(list.contains(nums1[i])){
                    arr[k]=nums1[i];
                    k++;
                    list.remove(Integer.valueOf(nums1[i]));
                }
            }
        }
        else{
          //  int arr[]= new int[nums2.length];
           // int k=0;

            for(int i=0; i<nums1.length; i++){
                list.add(nums1[i]);
            }
            for(int i=0; i<nums2.length; i++){
                if(list.contains(nums2[i])){
                    arr[k]= nums2[i];
                    k++;
                    list.remove(Integer.valueOf(nums2[i]));
                }
            }
        }
       
        return Arrays.copyOfRange(arr,0,k);
    
    }
}