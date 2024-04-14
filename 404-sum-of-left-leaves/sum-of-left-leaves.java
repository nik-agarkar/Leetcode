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
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;
        Stack<TreeNode> st=new Stack<>();
        while(true){
            while(root!=null){
                st.push(root);
                if(root.left!=null && root.left.left==null && root.left.right==null)
                    sum += root.left.val;
                
                root = root.left;
            }

            if(st.isEmpty())
                break;
            
            root = st.pop();
            root = root.right;
        }
        return sum;
    }
}