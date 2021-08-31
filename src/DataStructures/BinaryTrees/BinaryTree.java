public class BinaryTree {
	Node root;

	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	/*
	*
	* Count the nodes in the binary tree to which root points, and return the
	* answer. If root is null, the answer is zero.
	*/
	static int countNodes(Node root) {
		if (root == null)
			return 0; // The tree is empty. It contains no nodes.
		else {
			int count = 1; // Start by counting the root.
			count += countNodes(root.left); // Add the number of nodes
			// in the left subtree.
			count += countNodes(root.right); // Add the number of nodes
			// in the right subtree.
			return count; // Return the total.
		}
	} // end countNodes()

	public static void main(String args[]) {
		System.out.println("\nHello This is a Binary Tree\n");
		BinaryTree tree = new BinaryTree();
		/* create root */
		tree.root = new Node(1);
		/*
		 * following is the tree after above statement 1 / \ null null
		 */

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/*
		 * 2 and 3 become left and right children of 1 1 / \ 2 3 / \ / \ null null null
		 * null
		 */

		tree.root.left.left = new Node(4);
		/*
		 * 4 becomes left child of 2 1 / \ 2 3 / \ / \ 4 null null null / \ null null
		 * 
		 */
		// Printing out the number of nodes in this binary tree
		int NumofNodes = countNodes(tree.root);
		System.out.println("\n"+NumofNodes+"\n"); 

	} // END MAIN
} // CLASS BINARY TREES
