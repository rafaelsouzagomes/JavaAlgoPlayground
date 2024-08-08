package tree;

public class Postorder {

	public void postorderTraversal(TreeNode root) {
	    if (root == null) return;

	    postorderTraversal(root.left); // Visita a subárvore esquerda
	    postorderTraversal(root.right); // Visita a subárvore direita
	    System.out.print(root.val + " "); // Visita a raiz
	}

	public static void main(String[] args) {
		Postorder solution = new Postorder();
	    
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

	    System.out.print("Postorder traversal: ");
	    solution.postorderTraversal(root); // Output: 4 5 2 3 1
	}
}
