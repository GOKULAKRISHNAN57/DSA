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
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return head;
        }

        ListNode temp = head;

        while(temp != null){
            if(temp.next == null){
                break;
            }
            int data = temp.val;
            temp.val = temp.next.val;
            temp.next.val = data;
            temp = temp.next.next;
        }

        return head;
    }
}