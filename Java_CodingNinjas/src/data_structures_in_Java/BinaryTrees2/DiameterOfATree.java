package data_structures_in_Java.BinaryTrees2;

public class DiameterOfATree {
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {
		return 1+height(root.left)+height(root.right);
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1+Math.max(leftHeight, rightHeight);
	}

}
