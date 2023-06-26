package Day6;

public class deletegiven {
      if(t==null)
    return;
    t.num = t.next.num;
    t.next = t.next.next;
    return;
}
