package AlternateBinaryTree;

// import java.util.Stack;
/*
 * Java Program to traverse a binary search tree
 * using inorder traversal without recursion 
 * and print all nodes in sorted order
 * In InOrder traversal first left node is visited, followed by root
 * and right node.
 *
 * input:
 *      40
 *     /\
 *    20   50
 *   / \    \
 *  10  30   60
 * /   /  \
 * 5  67  78
 *
 * output: 5 10 20 30 40 50 60 67 78
 */

class binarytree {
    static class TreeNode {
        String data;
        TreeNode left, right;

        TreeNode(String value) {
            this.data = value;
            left = right = null;
        }
    }

    // root of binary tree
    TreeNode root;

    /**
     * traverse the binary tree in in-order traversal algorithm
     */
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.printf("%s ", node.data);
        inOrder(node.right);
    }

    /**
     * Java method to create binary tree with test data
     *
     * @return a sample binary tree for testing
     */
    public static binarytree create() {
        binarytree tree = new binarytree();
        TreeNode root = new TreeNode("40");
        tree.root = root;
        tree.root.left = new TreeNode("20");
        tree.root.left.left = new TreeNode("10");
        tree.root.left.left.left = new TreeNode("5");
        tree.root.left.right = new TreeNode("30");
        tree.root.right = new TreeNode("50");
        tree.root.right.right = new TreeNode("60");
        tree.root.left.right.left = new TreeNode("67");
        tree.root.left.right.right = new TreeNode("78");
        return tree;
    }
}