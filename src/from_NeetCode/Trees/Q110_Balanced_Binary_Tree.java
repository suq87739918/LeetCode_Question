public class Q110_Balanced_Binary_Tree {
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
    public static boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    private static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = height(root.right);
        if(rightHeight == -1){
            return -1;
        }
        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
