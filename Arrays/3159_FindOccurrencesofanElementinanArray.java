class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int ans[]= new int[queries.length];
        int c=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                c++;
            }
        }
        int hash[]= new int [c+1];
        int occur=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x){
                occur++;
                hash[occur]=i;
            }
        }
        for(int i=0; i<queries.length; i++){
            if(queries[i]<=c){
                ans[i]=hash[queries[i]];
            }
            else{
                ans[i]=-1;
            }
        }

        return ans;
    }
}