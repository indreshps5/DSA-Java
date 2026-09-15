class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        s=s+' ';
        String str="", word="";

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }
            else if(word.length()!=0){
                str=' ' +word + str;
                word="";
            }
        }
        str=str.trim();
        return str;
    }
}