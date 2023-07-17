package data_structures_in_Java.BST1;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class CheckIfBinaryTreeIsBST {
	public static boolean isBST(BinaryTreeNode<Integer> root) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	public static boolean isBST(BinaryTreeNode<Integer> root, int minRange, int maxRange) {
		if(root==null) {
			return true;
		}
		if(root.data<minRange||root.data>maxRange) {
			return false;
		}
		boolean isLeftRange =isBST(root.left,minRange,root.data-1);
		boolean isRightRange =isBST(root.right,root.data,maxRange);
		return isLeftRange && isRightRange;
	}

}
