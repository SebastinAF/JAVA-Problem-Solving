package Trees;

class TreeNode2 {
    int val;
    TreeNode2 left;
    TreeNode2 right;
    TreeNode2() {}
    TreeNode2(int val) { this.val = val; }
    TreeNode2(int val, TreeNode2 left, TreeNode2 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution03 {
    public boolean isSameTree(TreeNode2 p, TreeNode2 q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

public class IsSameTreeMain {

    public static TreeNode2 rootNode1;
    public static TreeNode2 rootNode2;

    public static void insert(int val) {
        rootNode1 = insert(rootNode1, val);
    }
    public static void insert2(int val) {
        rootNode2 = insert(rootNode2, val);
    }

    public static TreeNode2 insert(TreeNode2 rootNode, int val) {
        if (rootNode == null) return new TreeNode2(val);

        if (val > rootNode.val) rootNode.right = insert(rootNode.right, val);
        else if (val < rootNode.val) rootNode.left = insert(rootNode.left, val);

        return rootNode;
    }

    public static void main(String[] args) {
        Solution03 S03 = new Solution03();

        int[] arr = {1, 2, 3,};
        int[] arr2 = {1, 3};

        for (int i : arr) insert(i);
        for (int i : arr2) insert2(i);

        System.out.println(S03.isSameTree(rootNode1, rootNode2));
    }
}
