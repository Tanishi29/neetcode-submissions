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
    public boolean isBalanced(TreeNode root) {

        /*
        if the root val is null so the tree is balanced so return true
        we calculate the height of the tree like the older problem so we call
        that specific method that does it: height
        for each left and right node we call the height
        height also finds the height of each root val using recursion 
        and returns the height
        if the difference between the left and right height > 1
        return false
        and again we return through recursion by callking the method recursively
        until the process ends

        */

      

        if(root == null){
            return true;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(left - right) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
        
        
        
    }

    public int height(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(right, left) + 1;
    }
}
