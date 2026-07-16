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

        ListNode curr = head;
        int size = 0; 

        while(curr != null){
            size++;
            curr = curr.next;
        }

        int [] arr = new int [size];
        curr = head;
        int i = 0;
        while(curr != null){
            arr[i++] = curr.val;
            curr = curr.next;
        }

        int targetIndex = size - n;
        int [] newArr = new int[size - 1];
        int k = 0;

        for(int j = 0; j < arr.length; j++){
            if(j == targetIndex){
                continue;
            }
            newArr[k] = arr[j];
            k++;
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

    for(int num : newArr){
    tail.next = new ListNode(num);
    tail = tail.next;
    }

    return dummy.next;

    }
}
