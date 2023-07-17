package data_structures_in_Java.BST1;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class ReplaceWithSumOfGreaterNodes {
	public static void replaceNodeWithLargestSum(BinaryTreeNode<Integer> root) {
		replaceNodeWithLargestSum(root,0);
	}

	private static int replaceNodeWithLargestSum(BinaryTreeNode<Integer> root, int i) {
		if(root==null) {
			return i;
		}
		i=replaceNodeWithLargestSum(root.right,i);
		i+=root.data;
		root.data=i;
		return replaceNodeWithLargestSum(root.right,i);
		
	}

}
