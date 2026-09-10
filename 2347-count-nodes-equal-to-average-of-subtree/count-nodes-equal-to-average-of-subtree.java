class Solution {

    int count = 0;

    public int averageOfSubtree(TreeNode root) {
        find(root);
        return count;
    }

    public int[] find(TreeNode root) {

        if (root == null) {
            return new int[]{0, 0};
        }

        int[] left = find(root.left);
        int[] right = find(root.right);

        int sum = root.val + left[0] + right[0];
        int nodes = 1 + left[1] + right[1];

        int average = sum / nodes;

        if (average == root.val) {
            count++;
        }

        return new int[]{sum, nodes};
    }
}