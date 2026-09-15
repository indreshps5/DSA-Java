class Solution {
    public int[] plusOne(int[] digits) {
        int arr[]= new int[digits.length+1];
        int carry=0;
        arr[arr.length-1]=(digits[digits.length-1]+1)%10;
        carry=(digits[digits.length-1]+1)/10;
        for(int i=digits.length-2; i>=0; i--){
            if(carry!=0){
            arr[i+1]=(digits[i]+carry)%10;
            carry=(digits[i]+carry)/10;

            }
            else{
                arr[i+1]=digits[i];
            }
        }
        if(carry!=0){
            arr[0]=carry;
            return arr;
        }
        return Arrays.copyOfRange(arr,1,arr.length);
    }
}