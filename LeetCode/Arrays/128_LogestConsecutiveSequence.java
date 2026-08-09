class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        HashSet<Integer> set = new HashSet<>();
        int max=1, cons=1;
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }

        for(int val : set){
            if(!set.contains(val-1)){
                int x=val;
                while(set.contains(x+1)){
                    cons++;
                    x=x+1;
                }
                max=Math.max(max, cons);
                cons=1;
            }
        }
        
        return max;
    }
}