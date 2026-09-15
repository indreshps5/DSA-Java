class Solution {
    public int findContentChildren(int[] g, int[] s) {
      
        if(s.length==0){
            return 0;
        }
          int c=0, i=g.length-1,j=s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
       while(i>=0&&j>=0){
        if(s[j]>=g[i]){
            c++;
            j--;
        }
        i--;
       }
       return c;
        
    }
}