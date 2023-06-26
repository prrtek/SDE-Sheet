package Day6;

import java.util.HashSet;

public class returnsnodecycle {
        HashSet <ListNode> hashTable=new HashSet<>();
    while(head != null) {
        if(hashTable.contains(head)) return head;
        hashTable.add(head);
        head = head.next;
    }
    return null;
}
}
