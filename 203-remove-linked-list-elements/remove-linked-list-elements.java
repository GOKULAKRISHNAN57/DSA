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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            if(head.val == val){
                head = null;
                return head;
            }
            return head;
        }

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode newtemp;
        while(temp2 != null){
            newtemp = temp2.next;
            if(temp2.val == val){
                temp1.next = temp2.next;
                if(temp1.next == null){
                    break;
                }
                temp2 = newtemp;
            }
            else{
            temp1 = temp1.next;
            temp2 = temp2.next;
            }
        }
        if(head.val == val){
            head = head.next;
        }
        return head;

    }
}