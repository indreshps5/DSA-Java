class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null) return head;
        if(head.next==null) return head;

        ListNode leftN;
        ListNode rightN;
        int arr[]= new int[right-left+1];
        ListNode curr= head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
         curr= head;  

        if(left==1&&right==count){
            for(int i=right-left; i>=0; i--){
                arr[i]= curr.val;
                curr= curr.next;
            }
            head=new ListNode(arr[0]);
            curr=head;
            for(int i=1;i<=right-left; i++){
                curr.next= new ListNode(arr[i]);
                curr=curr.next;
            }

        }
        else if(left==1&&right<count){
            int c=1;
          while(c<=right){
            c++;
            curr=curr.next;
        }
        rightN= curr;
        curr= head;
        for(int i=right-left; i>=0;i--){
            arr[i]= curr.val;
            curr=curr.next;
        }
        head= new ListNode(arr[0]);
        curr= head;
        for(int i=1;i<=right-left; i++){
            curr.next= new ListNode(arr[i]);
            curr= curr.next;
        }
        curr.next= rightN;


        }
        else if(left>1&&right==count){
            int c=1;
         while(c<left-1){
            c++;
            curr= curr.next;
        }
        leftN= curr;
        curr=leftN.next;
      
        for(int i=right-left; i>=0; i--){
            arr[i]= curr.val;
            curr=curr.next;
        }
         for(int i=0; i<=right-left;i++){
            leftN.next=new ListNode(arr[i]);
            leftN=leftN.next;
        }
        

        }
        else{
                
               int c=1;
        while(c<left-1){
            c++;
            curr= curr.next;
        }
        leftN= curr;
        while(c<=right){
            c++;
            curr=curr.next;
        }
        rightN= curr;
        curr=leftN.next;
      
        for(int i=right-left; i>=0; i--){
            arr[i]= curr.val;
            curr=curr.next;
        }
        for(int i=0; i<=right-left;i++){
            leftN.next=new ListNode(arr[i]);
            leftN=leftN.next;
        }
        leftN.next=rightN;

        }
        return head;
        
    }
}