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
        
        
        Stack<TreeNode[]> s = new Stack<>();

        s.push(new TreeNode[]{p,q});

        while(!s.isEmpty()){
            TreeNode[] nodes = s.pop();
            TreeNode N1 = nodes[0];
            TreeNode N2 = nodes[1];

            if(N1 == null && N2 == null){
                continue;
            }
            if(N1 == null || N2 == null || N1.val != N2.val){
                return false;
            }

            s.push(new TreeNode[]{N1.left,N2.left});
            s.push(new TreeNode[]{N1.right,N2.right});
        }

        return true;

    }
}
