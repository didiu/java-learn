import java.util.LinkedList;
import java.util.Queue;

public class Num116 {
    public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int s=queue.size();
            for(int i=0;i<s;i++){
                Node n=queue.poll();
                if(i<s-1){
                    n.next=queue.peek();
                }
                if(n.left!=null){
                    queue.offer(n.left);
                }
                if(n.right!=null){
                    queue.offer(n.right);
                }
            }
        }
        return root;
    }
    public Node connect1(Node root){
        if(root==null) return null;
        Node newHead=root;
        while(newHead.left!=null){
            Node head=newHead;
            while(head!=null){
                head.left.next=head.right;
                if(head.next!=null){
                    head.right.next=head.next.left;
                }
                head=head.next;
            }
            newHead=newHead.left;
        }
        return root;
    }
    public Node connect2(Node root){
        if (root == null) {
            return null;
        }
        if(root.left!=null){
            root.left.next=root.right;
            if(root.next!=null){
                root.right.next=root.next.left;
            }
            connect2(root.left);
            connect2(root.right);
        }
        return root;
    }
}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
