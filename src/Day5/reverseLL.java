package Day5;

public class reverseLL {
    
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode first=head;
        ListNode second=null;
        while(first!=null){
              second=first.next;
              first.next=prev;
              prev=first;
              first=second;
        }
        return prev;
    }
}

