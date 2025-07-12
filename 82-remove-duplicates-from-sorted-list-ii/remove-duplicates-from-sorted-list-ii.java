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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp1 = head;
        ListNode temp2 = head.next;

        while(temp2 != null){
            boolean isDuplicate = false;
            
            while(temp2 != null && temp1.val == temp2.val){
                isDuplicate = true;
                temp2 = temp2.next;
            }

            if(isDuplicate){
                prev.next = temp2; 
                temp1 = temp2;
                if(temp2 != null){
                    temp2 = temp2.next;
                }
            } else {
                prev = temp1;
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }

        return dummy.next;
    }
}
