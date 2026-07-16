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
    public boolean hasCycle(ListNode head) {

        /*remember hashset is used for frequency
        keep checking is the current node isn't null
        if the value after curr is already present return true for cycle
        add the current curr 
        and set curr = curr.next;
        return false by default
        */

        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;


        if(curr == null){
            return false;
        }

        while(curr != null){
            if(set.contains(curr.next)){
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }

        return false;
        
    }
}
