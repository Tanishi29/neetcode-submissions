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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        /*
        we use the code of the isSametree problem to recursively check
        if 2 trees are the same 
        we call that helper method in the subtree method (which calls the issame tree method)
        and return is left = subroot or right root = subroot since it can be 
        on either side
        */


        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        if(isSameTree(root, subRoot)){
            return true;
        }

        
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }

        if((root.val) != (subRoot.val)){
            return false;
        }

        
        
        return isSameTree(root.left, subRoot.left) && isSameTree(root.right, subRoot.right);

    }
}
