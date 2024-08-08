package tree;

public class PreOrderDFS {

	 public void preorderTraversal(TreeNode root) {
	        if (root == null) return;

	        System.out.print(root.val + " "); // Visita a raiz
	        preorderTraversal(root.left); // Visita a subárvore esquerda
	        preorderTraversal(root.right); // Visita a subárvore direita
	    }

	    public static void main(String[] args) {
	        PreOrderDFS solution = new PreOrderDFS();
	        
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

	        System.out.print("Preorder traversal: ");
	        solution.preorderTraversal(root); // Output: 1 2 4 5 3
	    }
}
