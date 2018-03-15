//网上抄的例子
package linkedlist;

public class LinkList<T> {
    private Node<T> head;//链表的头节点
    private Node<T> tail;//链表的尾节点

    //定义链表
    private static class Node<T>{
        T data;//节点的数据
        Node<T> next;//该节点指向下一个节点的指针

        Node(T data){//构造函数
            this.data=data;
            this.next=null;
        }
    }

    //空的链表
    public LinkList(){
        head=tail=null;
    }

    //判断链表是否为空
    public boolean isEmpty(){
      return this.head==null || this.tail==null;
    }

    //加头节点
    public void addHead(T point){
        this.head=new Node<T>(point);
        if (tail==null){
            tail=head;
        }
    }

    //增加尾节点
    public void addTail(T point){
      tail=new Node<T>(point);
      head.next=tail;
    }

    public void insert(T point){
      if(this.head==null){
        addHead(point);
      }else if(this.tail==this.head){
        addTail(point);
      }else {
        Node<T> preNext =head.next;
        @SuppressWarnings({"unchecked","rawtypes"})
        Node<T> newNode =new Node(point);
        //preNext=head.next;
        //this.head.next=newNode;
        //newNode.next=preNext;
        newNode.next=this.head.next;
        this.head.next=newNode;
      }
    }

    public void printLinkList(){
      Node<T> curr=this.head;
      if(isEmpty()){
        try{
          throw new Exception("linklist is empty");
        }catch(Exception e){
          e.printStackTrace();
        }
      }
      while (curr!=null){
        System.out.println(curr.data+"");
        curr=curr.next;
      }
    }

    public void delete(T data){
        Node<T> curr=this.head;
        Node<T> prev=null;
        boolean suc=false;
        while(curr!=null){
          if (curr.data.equals(data)) {
            if (curr==head) {
              System.out.println('\n'+"delete head node");
              head=curr.next;
              suc=true;
              return;
            }
            if(curr==tail){
              System.out.println('\n'+"delete tail Node");
              tail=prev;
              prev.next=null;
              suc=true;
              return;
            }else{
              System.out.println("\n"+"delete Node");
              prev.next=curr.next;
              suc=true;
              return;
            }
          }
          prev=curr;
          curr=curr.next;
        }
        if (suc == false) {
          System.out.println('\n'+"none data");
      }
    }
}
