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

    @Test
    void testLinkListOne(){
      LinkListOne<String> mylist=new LinkListOne<String>();
      mylist.addHead("1");
      mylist.addHead("2");
      mylist.addHead("3");
      mylist.addHead("4");
      mylist.addTail("0");
      mylist.printLinkList();
      //mylist.delete("cdfafa");
      //mylist.printLinkList();
      //mylist.insert(1,"first");
      //mylist.printLinkList();
      //mylist.isExist("first");
    }
}
