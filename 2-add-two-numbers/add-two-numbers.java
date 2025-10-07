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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);   // dummy node to start the result list
        ListNode current = dummy;           // pointer to build the result list
        int carry = 0;                      // to hold carry between additions
        
        // loop until both lists are null and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;   // get value from l1 or 0 if null
            int y = (l2 != null) ? l2.val : 0;   // get value from l2 or 0 if null
            
            int sum = x + y + carry;             // add both values + carry
            carry = sum / 10;                    // calculate new carry
            current.next = new ListNode(sum % 10); // store the digit part
            current = current.next;              // move to next node
            
            if (l1 != null) l1 = l1.next;        // move to next node in l1
            if (l2 != null) l2 = l2.next;        // move to next node in l2
        }
        
        return dummy.next;  // skip dummy and return the actual head
    }
}
