/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Num876 {
    public ListNode middleNode(ListNode head) {
        ListNode pre=head;
        ListNode next=head;
        while(next!=null&&next.next!=null){
            next=next.next.next;
            pre=pre.next;
        }
        return pre;
    }
}