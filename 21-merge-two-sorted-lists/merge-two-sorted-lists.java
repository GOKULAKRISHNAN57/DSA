class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Dummy node to start the merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // While both lists have elements
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining elements
        current.next = (list1 != null) ? list1 : list2;

        // Return the start of the merged list
        return dummy.next;
    }
}
