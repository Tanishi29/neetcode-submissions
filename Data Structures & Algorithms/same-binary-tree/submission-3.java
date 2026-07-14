/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        /*isSameTree accepts 2 trees to compare
        if both trees are null we return true, if 1 of them is null while other isn't
        we return false
        if the tree is the same but values inside the tree aren't the same we return false
        the rest is recursive call of isSameTree(p.left, q.left) && isSameTreee(p.right, q.right)
        */

        

        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        
    }
}
