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
        return checkForSubRoot(root, subRoot);
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q!= null) return false;
        if(p != null && q== null) return false;
        if(p == null && q == null) return true;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    } 

    public boolean checkForSubRoot(TreeNode root, TreeNode subRoot) {
        //TreeNode temp = new TreeNode();
        if(root == null && subRoot != null) return false;
        if(root != null && subRoot == null) return false;
        if(root == null && subRoot == null) return true;
        if(isSameTree(root, subRoot)) return true;
        
        return checkForSubRoot(root.left, subRoot) || checkForSubRoot(root.right, subRoot);
    }
}
