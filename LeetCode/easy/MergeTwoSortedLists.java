/**
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 * */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
package easy;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null) return l1;

        ListNode head = (l1.val <= l2.val) ? l1 : l2;
        ListNode current = head;

        if (l1 == head) {
            l1 = l1.next;
        } else {
            l2 = l2.next;
        }

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                current.next = l2;
                break;
            }
            if (l2 == null) {
                current.next = l1;
                break;
            }

            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        return head;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){  val =x; }
}