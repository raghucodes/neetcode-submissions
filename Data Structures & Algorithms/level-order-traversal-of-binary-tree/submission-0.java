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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        while(!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int qLen = q.size();
            for(int i=0;i<qLen;i++) {
                TreeNode node = q.poll();
                if(node != null) {
                    list.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if(list.size() > 0) {
                result.add(list);
            }
        }
        return result;
    }
}
