/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        if(head.next == head){
            return true;
        }

       ListNode turle = head;
       ListNode hare = turle.next;

       boolean check = false;


       while(turle != hare){

        if(turle == head){
            turle = head ;
        }

        if(hare == null || hare.next == null){
            break;
        }
        turle = turle.next;
        hare = hare.next.next;
       }

       if(turle == hare){
        return true;
       }
       return false;
    }
}