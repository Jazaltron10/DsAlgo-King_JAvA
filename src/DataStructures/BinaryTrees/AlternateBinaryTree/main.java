package AlternateBinaryTree;

public class main {

    public static void main(String[] args) throws Exception { // construct the binary tree given in question
        binarytree bt = binarytree.create();
        // traversing binary tree using InOrder traversal using recursion
        System.out.println("printing nodes of binary tree on InOrder using recursion");
        bt.inOrder();
    }

}