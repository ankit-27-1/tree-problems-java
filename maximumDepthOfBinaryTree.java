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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=1;
        return max(root,ans);
    }
    public int max(TreeNode root,int ans){
        if(root.left==null && root.right==null){
            return 1;
        }
        if(root.left==null){
            return max(root.right,ans)+1;
        }
        if(root.right==null){
            return max(root.left,ans)+1;
        }
        return Math.max(max(root.left,ans),max(root.right,ans))+1;
    }
}
