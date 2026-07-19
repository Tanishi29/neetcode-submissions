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
    /*
    current is facing head
while it doesn't become null, keep incrementing size to calculate the total size.

create an arr with the given size
we set pointers left = 0 and right = arr.length - 1

in order to alternate values [2, 4, 6, 8] to 2, 8, 4, 6
we need both pointers != each other
and while they're different we keep adding them in a fresh array

and while curr != null
we set curr.val = reordered[k]
and keep incrementing curr and k so that curr is changing values


    */
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
