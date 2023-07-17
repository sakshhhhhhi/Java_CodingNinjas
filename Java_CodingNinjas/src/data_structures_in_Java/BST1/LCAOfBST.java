package data_structures_in_Java.BST1;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class LCAOfBST {
	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) {
			return -1;
		}
		if(root.data<a&&root.data<b) {
			return getLCA(root.left,a,b);
		}
		else if(root.data>a&&root.data>b) {
			return getLCA(root.right,a,b);
		}
		return root.data;
	}

}
