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
         List<List<Integer>> L = new ArrayList<>();
        if(root == null){
            return L;
        }


    Queue<TreeNode> s = new LinkedList<>();

        s.add(root);
        
        while(!s.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int si = s.size();
            for(int i =0;i<si;i++){
                TreeNode cur = s.remove();
               level.add(cur.val);

                if(cur.left != null){
                    s.add(cur.left);
                }
                if(cur.right != null){
                    s.add(cur.right);
                }

            }
            L.add(level);
        }

        return L;
    }
}
