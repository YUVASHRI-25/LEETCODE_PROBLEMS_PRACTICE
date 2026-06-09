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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> x=new ArrayList<>();
        preorder(root,x);
        return x; 
    }
    private void preorder(TreeNode node,List<Integer> x)
    {
        if(node==null)
        {
            return;
        }
        x.add(node.val);
        preorder(node.left,x);
        preorder(node.right,x);
    }
}