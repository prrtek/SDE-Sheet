package Day6;

public class removeduplicates {
     ListNode node=head;
        if(head==null || head.next==null){
            return head;
        }
        while(head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
                
            }else{
                head=head.next;
            }
        }

       
        return node;
}
