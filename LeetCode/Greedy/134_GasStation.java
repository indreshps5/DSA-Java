class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas =0, totalcost=0;
        for(int i=0; i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int idx=0, curr=0;
        for(int i=0; i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                idx=i+1;
            }
        }
        return idx;
        
    }
}