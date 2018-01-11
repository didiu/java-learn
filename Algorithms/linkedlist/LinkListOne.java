//我自己写的例子
package linkedlist;

public class LinkListOne<T>{

  //定义链表
  private static class Node<T>{
    T date;
    Node<T> next;

    Node(T date){
      this.date=date;
      this.next=null;
    }
  }

  //头节点和尾节点
  private Node<T> head;
  private Node<T> tail;

  //空链表
  public LinkListOne(){
    head=tail=null;
  }

  //链表是否为空
  public boolean isEmpty(){
    return this.head==null||this.tail==null;
  }

  //从头插入数字
  public void addHead(T point){
    if (head==null) {
      head=new Node<T>(point);
    }else {
      if (tail==null) {
        tail=head;
        head=new Node<T>(point);
        head.next=tail;
      }else{
        Node<T> newNode=new Node<T>(point);
        newNode.next=head;
        Node<T> prev=head;
        head=newNode;
        newNode=prev;
      }
    }
  }

  //从尾部插入数字
  public void addTail(T point){
    if (tail==null) {
      tail=new Node<T>(point);
    }else{
      if (head==null) {
        head=tail;
        tail=new Node<T>(point);
        head.next=tail;
      }else{
        Node<T> newNode=new Node<T>(point);
        tail.next=newNode;
        Node<T> prev=tail;
        tail=newNode;
        newNode=prev;
      }
    }
  }

  public void printLinkList(){
    Node<T> curr=this.head;
    if (isEmpty()) {
      try{
        throw new Exception("____ ");
      }
      catch(Exception e){
        e.printStackTrace();
      }
    }
    while(curr!=null){
      System.out.println(curr.date+" ");
      curr=curr.next;
    }
  }

  public void add(int i,T point){
    if (this.head==null) {
      addHead(point);
    }else if (this.head==this.tail) {
      addTail(point);
    }else{
      Node<T> newNode=new Node<T>(point);
      tail.next=newNode;
      tail=newNode;
    }
  }
}
