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
        
        

        int size = 0; 
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        int [] arr = new int[size];
        int i = 0;
        ListNode temp2 = head;
        while(temp2 != null){
            arr[i] = temp2.val;
            temp2 = temp2.next; 
            i++;
        }

        int temp3 = 0;
        for(int j = 0; j < arr.length / 2; j++){
            temp3 = arr[j];
            arr[j] = arr[arr.length - 1 - j];
            arr[arr.length - 1 - j] = temp3;
        }

        if(arr == null || arr.length == 0){
            return null;
        }

        ListNode head2 = new ListNode(arr[0]);
        ListNode  curr = head2;

        

        for(int k = 1; k < arr.length; k++){
            curr.next = new ListNode(arr[k]);
            curr = curr.next;
        }

        return head2;
        
    }
}
