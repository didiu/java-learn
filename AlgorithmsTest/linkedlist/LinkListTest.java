package linkedlist;

import org.junit.jupiter.api.Test;

public class LinkListTest{
    @Test
    void testLinkList(){
      LinkList<Integer> mylist=new LinkList<Integer>();
      mylist.insert(2);
      mylist.insert(3);
      mylist.insert(5);
      mylist.insert(4);
      mylist.delete(4);
      mylist.printLinkList();
    }
}
