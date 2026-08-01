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
        
        return add(l1, l2, 0);
    }

    public ListNode add(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0){
            return null;
        }

        int operand1 = 0;
        int operand2 = 0; 

        if(l1 != null){
            operand1 = l1.val;
        }
        if(l2 != null){
            operand2 = l2.val;
        }

        int sum = operand1 + operand2 + carry;
        int newcarry = sum / 10; 
        int val = sum % 10;

        ListNode output = add(
            (l1 != null) ? l1.next : null,
            (l2!=null) ? l2.next : null,
            newcarry

        );
            

        return new ListNode(val, output);

    }
}
