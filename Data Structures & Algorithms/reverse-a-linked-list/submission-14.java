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

        if (head == null) {
        return null;
        }

        int size = 0; 
        ListNode curr = head;
        while(curr != null){
            size++;
            curr = curr.next;
        }

        int [] arr = new int[size];
        curr = head;
        int i = 0;
        while(curr!= null){
            arr[i++] = curr.val;
            curr = curr.next;
        }

        int left = 0; 
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }


        ListNode head2 = new ListNode(arr[0]);
        ListNode curr2 = head2;
        
        for (int k = 1; k < arr.length; k++) {
            curr2.next = new ListNode(arr[k]);
            curr2 = curr2.next;
        }

        return head2;
        
        
    }
}
