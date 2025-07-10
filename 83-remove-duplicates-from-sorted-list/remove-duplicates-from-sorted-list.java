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
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode newnode;

        while(temp1 != null){
            newnode = temp2.next;
            if(temp1.val == temp2.val){
                temp1.next = temp2.next;
                temp2.next = null;
                temp2 = newnode;
                if(temp1.next == null){
                    break;
                } 
            }
            else{
                temp1 = temp2;
                temp2 = newnode;
                if(temp2 == null){
                    break;
                }
            }

        }

        return head;
    }
}