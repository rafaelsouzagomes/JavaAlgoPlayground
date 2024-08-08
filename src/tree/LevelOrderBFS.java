package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderBFS {

	public void levelOrderTraversal(TreeNode root) {
	    if (root == null) return;

	    Queue<TreeNode> queue = new LinkedList<>();
	    queue.add(root);

	    while (!queue.isEmpty()) {
	        TreeNode current = queue.poll();
	        System.out.print(current.val + " ");

	        if (current.left != null) queue.add(current.left);
	        if (current.right != null) queue.add(current.right);
	    }
	}

	public static void main(String[] args) {
		LevelOrderBFS solution = new LevelOrderBFS();
	    
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
	    System.out.print("Level order traversal: ");
	    solution.levelOrderTraversal(root); // Output: 1 2 3 4 5
	}
}
