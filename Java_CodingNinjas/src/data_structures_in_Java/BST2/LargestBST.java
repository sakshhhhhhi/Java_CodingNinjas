package data_structures_in_Java.BST2;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class LargestBST {
	
	private static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return 1+Math.max(leftHeight, rightHeight);
	}
	
	private static boolean isBST(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root==null) {
			return true;
		}
		if(root.data< minRange||root.data > maxRange) {
			return false;
		}
		else {
			return isBST(root,root.data+1,maxRange)&&isBST(root,minRange, root.data-1);
		}
	}
	
	
	
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE)) {
			return height(root);
		}
		else {
			return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
		}
	}

}
