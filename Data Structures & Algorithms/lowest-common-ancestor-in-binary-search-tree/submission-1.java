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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        /* 
        if root is null and everything else is null too then return null

        if the max value of p and q is less than root, go to the left side
        if the min is also greater than the root, then right subtree 
        return the root. 
        */

        if(root == null || p == null || q == null){
            return null;
        }

        if(Math.max(p.val, q.val) < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        else if(Math.min(p.val, q.val) > root.val){
                return lowestCommonAncestor(root.right, p, q);
        }
        else{
            return root;
        }

        
    }
}
