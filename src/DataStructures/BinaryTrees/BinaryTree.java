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
		 * following is the tree after above statement 
		 * 			1 
		 * 		   / \ 
		 *      null null
		 */

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);

		/*
		 * 2 and 3 become left and right children of 1
		 *  				1 
		 * 				/ 		\ 
		 * 			 2    			3 
		 * 		  /	    \ 		 /     \ 
		 *  	null   null    null    null
		 */
		
		tree.root.left.left = new Node(4);
		/*
		* 4 becomes left child of 2
		*  					1 
		* 				/ 		\ 
		* 			 2    			3 
		* 		  /	    \ 		 /     \ 
		*  	 	 4     null    null    null
		* 	   /   \
		* 	 null  null
		*/
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(2);
		tree.root.right.right = new Node(4);
		
		tree.root.left.left.left = new Node(50);
		tree.root.left.left.right = new Node(60);
		tree.root.left.right.left = new Node(70);
		tree.root.left.right.right = new Node(80);
		
		tree.root.right.left.left = new Node(55);
		tree.root.right.left.right = new Node(65);
		tree.root.right.right.left = new Node(75);
		tree.root.right.right.right = new Node(85);
		
		/*
		* 4 becomes left child of 2
		*  					1 
		* 				/ 		\ 
		* 			 2    			3 
		* 		  /	    \ 		 /     \ 
		*  	 	 4       5      2       4
		* 	   /   \
		* 	 null  null
		*/
		


		// Printing out the number of nodes in this binary tree
		int NumofNodes = countNodes(tree.root);
		System.out.println("\n"+NumofNodes+"\n"); 
		
		//This is a preorder traversal of the binary tree, root is printed first followed by items in the left side of the tree and then items in the right side of the tree
		System.out.printf("\n\n\n{PREORDER}<--> 1st -> Root : 2nd -> left subtree : 3rd -> right subtree%n"); 
		tree.preorderPrint(tree.root);
		
		//This is a postorder traversal of the binary tree, items in the left side of the tree are printed first, followed by items in the right side of the tree and then the item in the root is printed last
		System.out.printf("\n\n\n{POSTORDER}<--> 1st -> left subtree : 2nd -> right subtree : 3rd -> Root%n");
		postorderPrint(tree.root);
		
		//This is an inorder traversal of the binary tree, items in the left side of the tree are printed first, followed by items in the root node and then items in the right subtree is printed last 
		System.out.printf("\n\n\n{INORDER}<--> 1st -> left subtree : 2nd -> Root : 3rd -> right subtree%n");
		inorderPrint(tree.root);

	} // END MAIN





	// PREORDER TRAVERSAL -------------------------------->
	/*
	 * Print all the items in the tree to which root points. The item in the root is
	 * printed first, followed by the items in the left subtree and then the items
	 * in the right subtree.
	 */
	void preorderPrint(Node root) {
		if (root != null) { // (Otherwise, there’s nothing to print.)
			System.out.print(root.data + " "); // Print the root item.
			preorderPrint(root.left); // Print items in left subtree.
			preorderPrint(root.right); // Print items in right subtree.
		}
	} // end preorderPrint()





	// POSTORDER TRAVERSAL -------------------------------->
	/*
	 * Print all the items in the tree to which root points. The items in the left
	 * subtree are printed first, followed by the items in the right subtree and
	 * then the item in the root node.
	 */
	static void postorderPrint(Node root) {
		if (root != null) { // (Otherwise, there’s nothing to print.)
			postorderPrint(root.left); // Print items in left subtree.
			postorderPrint(root.right); // Print items in right subtree.
			System.out.print(root.data + " "); // Print the root item.
		}
	} // end postorderPrint()
	/*
	 * Print all the items in the tree to which root points. The items in the left
	 * subtree are printed first, followed by the item in the root node and then the
	 * items in the right subtree.
	 */



	
	// INORDER TRAVERSAL -------------------------------->
	/*
	 * Print all the items in the tree to which root points. The items in the left
	 * subtree are printed first, followed by the item in the root node and then the
	 * items in the right subtree.
	 */
	

	static void inorderPrint(Node root) {
		if (root != null) { // (Otherwise, there’s nothing to print.)
			inorderPrint(root.left); // Print items in left subtree.
			System.out.print(root.data + " "); // Print the root item.
			inorderPrint(root.right); // Print items in right subtree.
		}
	} // end inorderPrint()
} // CLASS BINARY TREES
