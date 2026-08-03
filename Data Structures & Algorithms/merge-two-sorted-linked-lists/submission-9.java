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


        /* needs more practice */ 

        /*
        if either of the lists is null, we return the other
        the curr will point to the list who has the smaller or 
        equal value than the other and point to the list and
        increment the list = list.next
        the curr will point at head and depending on which list.val is
        less, the curr points at the list and it increments (list.next 
        and curr.next and remaining values of either are put and return
        head
        */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null){
            return list2;
        }
        else if(list2 == null){
            return list1;
        }

        ListNode head;
        if(list1.val <= list2.val){
            head = list1;
            list1 = list1.next;

        }
        else{
            head = list2;
            list2 = list2.next;
        }

        ListNode curr = head;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if(list1 != null){
            curr.next = list1;
        }
        if(list2 != null){
            curr.next = list2;
        }

        return head;

        

        
        
        
    }
}