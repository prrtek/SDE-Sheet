package Day5;
public static Node removeKthNodeFromEnd(Node head, int k) {
    if (head == null) {
        return null;
    }
    
    // Use two pointers: fast and slow
    Node fast = head;
    Node slow = head;
    
    // Move the fast pointer K nodes ahead
    for (int i = 0; i < k; i++) {
        if (fast == null) {
            return head; // K is out of range
        }
        fast = fast.next;
    }
    
    // If fast pointer reaches the end, remove the head node
    if (fast == null) {
        return head.next;
    }
    
    // Move both pointers until the fast pointer reaches the end
    while (fast.next != null) {
        fast = fast.next;
        slow = slow.next;
    }
    
    // Remove the Kth node from the end
    slow.next = slow.next.next;
    
    return head;
}
 
