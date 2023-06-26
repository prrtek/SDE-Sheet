package Day6;

public class rotatebynLL {
    if (head == null || head.next == null || k == 0) {
        return head;
    }
    
    int size = 1;
    ListNode tail = head;
    
    // Find the size of the linked list and locate the tail node
    while (tail.next != null) {
        tail = tail.next;
        size++;
    }
    
    // Calculate the effective number of rotations
    int rotations = k % size;
    
    if (rotations == 0) {
        return head; // No actual rotation needed
    }
    
    // Connect the tail node with the head node to form a circular linked list
    tail.next = head;
    
    // Find the new head and break the circular link after the rotation
    ListNode newTail = head;
    for (int i = 0; i < size - rotations - 1; i++) {
        newTail = newTail.next;
    }
    ListNode newHead = newTail.next;
    newTail.next = null;
    
    return newHead;
}
