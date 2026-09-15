class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        int c=0;
        ListNode curr= head;
        while(curr!=null){
            c++;
            curr= curr.next;
        }
        curr=head;
        Stack<Integer> st= new Stack<>();
        if(c%2==0){
            for(int i=1; i<=c/2; i++){
                st.push(curr.val);
                curr= curr.next;
            }

            while(curr!=null){
                if(st.peek()!=curr.val){
                    return false;
                }
                st.pop();
                curr= curr.next;
            }
        }
        else{
            for(int i=1; i<=c/2; i++){
                st.push(curr.val);
                curr= curr.next;
            }
            curr= curr.next;
            while(curr!=null){
                if(st.peek()!=curr.val){
                    return false;
                }
                st.pop();
                curr= curr.next;
            }
        }
        
        return true;
    }
}