class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode start= head;
        ListNode curr= head;
        boolean flag= true;
        while(curr!=null){
            if(curr.val<x){
                head=new ListNode(curr.val);
                curr=curr.next;
                flag= false;
                break;
            }
            curr= curr.next;
        }
        if(flag) return head;
        
        ListNode mover= head;
        while(curr!=null){
            if(curr.val<x){
                mover.next=new ListNode(curr.val);
                mover= mover.next;
            }
            curr= curr.next;
        }
        while(start!=null){
            if(start.val>=x){
                mover.next= new ListNode(start.val);
                mover= mover.next;
            }
            start= start.next;
        }

        return head;
        
    }
}