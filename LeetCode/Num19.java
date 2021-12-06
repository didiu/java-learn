public class Num19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre=new ListNode(0,head);
        ListNode next=new ListNode(0,head);
        ListNode ans=new ListNode(0,head);
        while(next.next!=null){
            next=next.next;
            if(n--<=0){
                pre=pre.next;
            }
        }
        pre.next=pre.next.next;
        return ans.next;
    }
}
