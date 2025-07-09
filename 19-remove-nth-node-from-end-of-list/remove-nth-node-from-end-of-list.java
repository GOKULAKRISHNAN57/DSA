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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        if(head == null){
            return head;
        }
        if(head.next == null && n==1){
            head = null;
            return head;
        }
        ListNode temp1 = head;
        while(temp1 != null){
            size++;
            temp1 = temp1.next;
        }

        if(size == n){
            temp1 = head;
            head = head.next;
            temp1.next = null;
            return head;
        }
        temp1 = head;
        int remove = size - n;
        size = 0;
        while(temp1 != null){
            size++;
            if(size == remove){
                temp1.next = temp1.next.next;
                break;
            }
            temp1 = temp1.next;
        }
        return head;


    }
}