class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0,j=s.length()-1;
        boolean flag=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(!(isPalin(s.substring(0,i)+s.substring(i+1))||isPalin(s.substring(0,j)+s.substring(j+1)))){
                    flag = false;
                }
                break;
            }
            i++;
            j--;
        }
        if(flag){
        return true;
        }
        else{
            return false;
        }
    }
    private static boolean isPalin(String s){
        int i=0, j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}