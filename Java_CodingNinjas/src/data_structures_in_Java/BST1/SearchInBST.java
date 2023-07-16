package data_structures_in_Java.BST1;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class SearchInBST {
	public static boolean searchInBS(BinaryTreeNode<Integer> root, int k) {
		if(root==null) {
			return false;
		}
		if(root.data==k) {
			return true;
		}
		if(k<root.data) {
			return searchInBS(root.left,k);
		}
		return searchInBS(root.right,k);
	}

}
