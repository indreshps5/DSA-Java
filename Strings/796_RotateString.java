class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)) return true;
        for(int i=0; i<s.length()-1; i++){
            s=s.substring(1,s.length())+s.substring(0,1);
            if(s.equals(goal)) return true;
        }

        return false;
    }
}