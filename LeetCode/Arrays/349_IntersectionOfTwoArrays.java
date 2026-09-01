class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1= new HashSet<>();
        HashSet<Integer> set2= new HashSet<>();
        if(nums1.length<nums2.length){
            for(int i=0; i<nums2.length; i++){
                set1.add(nums2[i]);
            }
            for(int i=0; i<nums1.length; i++){
                if(set1.contains(nums1[i])){
                    set2.add(nums1[i]);
                }
            }
        }
        else{
            for(int i=0; i<nums1.length; i++){
                set1.add(nums1[i]);
            }
            for(int i=0; i<nums2.length; i++){
                if(set1.contains(nums2[i])){
                    set2.add(nums2[i]);
                }
            }
        }
        Iterator<Integer> it= set2.iterator();
        int arr[]= new int[set2.size()];
        int i=0;
        while(it.hasNext()){
            arr[i]=it.next();
            i++;
        }
        return arr;
    }
}