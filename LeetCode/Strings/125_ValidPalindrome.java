class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int first=0, last= s.length()-1;
        while(first<last){
            char ch1= s.charAt(first);
            char ch2= s.charAt(last);
            if(Character.isLetterOrDigit(ch1)&&Character.isLetterOrDigit(ch2)){
                if(ch1!=ch2){
                    return false;
                }
                first++;
                last--;
            }
            else if(Character.isLetterOrDigit(ch1)){
                last--;
            }
            else{
                first ++;
            }
        }
        return true;
        
    }
}