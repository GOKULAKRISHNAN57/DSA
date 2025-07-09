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
    public ListNode reverseList(ListNode head) {

        if(head == null ){
            return head;
        }

        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode newnode;

        if(temp2 == null){
            return head;
        }

        while(temp1 != null){
            newnode = temp2.next;
            if(temp1 == head){
                temp1.next = null;
            }
            if(newnode == null){
                temp2.next = temp1;
                head = temp2;
                break;
            }             

            temp2.next = temp1;
            temp1 = temp2;
            temp2 = newnode;
        }

        return head;
    }
}
