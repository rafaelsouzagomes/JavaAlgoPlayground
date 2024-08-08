package tree;

public class InorderTraversal {

	public void inorderTraversal(TreeNode root) {
	    if (root == null) return;

	    inorderTraversal(root.left); // Visita a subárvore esquerda
	    System.out.print(root.val + " "); // Visita a raiz
	    inorderTraversal(root.right); // Visita a subárvore direita
	}

	public static void main(String[] args) {
		InorderTraversal solution = new InorderTraversal();
	    
	    TreeNode root = new TreeNode(1);
	    root.left = new TreeNode(2);
	    root.right = new TreeNode(3);
	    root.left.left = new TreeNode(4);
	    root.left.right = new TreeNode(5);
	    
        /*
        1
     2		3
  4    5   
        */

	    System.out.print("Inorder traversal: ");
	    solution.inorderTraversal(root); // Output: 4 2 5 1 3
	}
}
