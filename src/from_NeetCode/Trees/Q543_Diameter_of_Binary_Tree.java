import javax.swing.tree.TreeNode;

public class Q543_Diameter_of_Binary_Tree {
    public static void main(String[] args) {

    }
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private static int output = 0;
    public static int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return output;
    }
    public static int dfs(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = dfs(root.left) + 1;
        int right = dfs(root.right) + 1;
        output = Math.max(output, right + left);
        return Math.max(right, left);
    }
}
