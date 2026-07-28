class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        HashSet<Integer> set= new HashSet<>();
        ListNode curr= head.next;
        ListNode prev= head;
       boolean flag= true;
        while(curr!= null){
            if(curr.val!=prev.val&&(!set.contains(prev.val))){
                head=prev;
                set.add(prev.val);
                prev=prev.next;
                curr= curr.next;
                flag= false;
                break;
            }
            set.add(prev.val);
            prev= prev.next;
            curr = curr.next;
        }
        if(flag){
            if(!set.contains(prev.val)){
                return prev;
            }
            head= null;
            return head;
        }
        ListNode mover = head;
        while(curr!=null){
            if(curr.val!=prev.val&&(!set.contains(prev.val))){
            mover.next=prev;
            mover= mover.next;
            }
            set.add(prev.val);
            prev= prev.next;
            curr= curr.next;
        }
        if(!set.contains(prev.val)){
            mover.next=prev;
            mover=mover.next;
        }
        mover.next= null;
        
        return head;
    }
}