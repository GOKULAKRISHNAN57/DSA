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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            head = null;
            return head;
        }
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int middle =size/2;
        size = -1;
        temp = head;
        while(temp != null){
            size++;
            if(size == middle-1){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        } 
        return head;
    }
}