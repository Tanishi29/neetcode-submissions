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
    public void reorderList(ListNode head) {
        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        int[] arr = new int[size];
        curr = head;
        int i = 0;
        while (curr != null) {
            arr[i++] = curr.val;
            curr = curr.next;
        }

        int[] reordered = new int[size];
        int left = 0;
        int right = arr.length - 1;
        int k = 0;

        while (left <= right) {
            reordered[k++] = arr[left];

            if (left != right) {
                reordered[k++] = arr[right];
            }

            left++;
            right--;
        }

        curr = head;
        k = 0;

        while (curr != null) {
            curr.val = reordered[k];
            curr = curr.next;
            k++;
        }
    }
}
