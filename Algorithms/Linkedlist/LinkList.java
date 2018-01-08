package Linkedlist;

//定义链表的结构体
public class LinkList<T> {
    private static class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data=data;
            this.next=null;
        }
    }
    private Node<T> head;
    private Node<T> tail;

    public LinkList(){
        head=tail=null;
    }

}
