package Trees;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> treeQueue = new LinkedList<>();
        treeQueue.offer(root);

        int depth = 0;

        while (!treeQueue.isEmpty()) {
            int size = treeQueue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = treeQueue.poll();

                if (node.left != null) treeQueue.offer(node.left);
                if (node.right != null) treeQueue.offer(node.right);
            }

            depth++;
        }

        return depth;
    }
}

public class maxDepthMain {

    static TreeNode rootNode;

    public static void insert(int val) {
        rootNode = insertRec(rootNode, val);
    }

    public static TreeNode insertRec(TreeNode rootNode, int val) {
        if (rootNode == null)
            return new TreeNode(val);

        if (val > rootNode.val)
            rootNode.right = insertRec(rootNode.right, val);
        else if (val < rootNode.val)
            rootNode.left = insertRec(rootNode.left, val);

        return rootNode;
    }

    public static void main(String[] args) {

        int[] values = {3, 9, 20, 15, 7};

        for (int v : values) {
            insert(v);
        }

        Solution sol = new Solution();
        int depth = sol.maxDepth(rootNode);

        System.out.println("Max Depth: " + depth);
    }
}