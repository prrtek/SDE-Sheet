package Day6;

import java.util.Stack;

public class palindromell {
      ListNode temp=new ListNode();
        temp=head;
        Stack<Integer> s=new Stack<>();
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        while(head!=null){
            int a=s.pop();
            if(head.val==a){
            head=head.next;
             }else{
                 return false;
             }
        }
        return true;
    }
}
