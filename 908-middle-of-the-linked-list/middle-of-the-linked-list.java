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
    public ListNode middleNode(ListNode head) {        
        if(head == null || head.next == null){
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
                head = temp.next;
                temp.next = null;
                break;
            }
            temp = temp.next;
        } 
        return head;
    }
}