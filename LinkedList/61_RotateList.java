class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        
        int c=0;
        ListNode curr= head;
        ListNode start= head;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        int place=k%c;
        if(place==0) return head;

        curr=head;
        for(int i=1; i<c-place; i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        curr= head;
        for(int i=1; i<place; i++){
            curr=curr.next;
        }
        curr.next=start;

        return head;

    }
}