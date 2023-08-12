package data_structures_in_Java.BinaryTrees2;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class MirrorBinaryTree {
	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		if(root==null){
			return;
		}
		if(root.left==null&&root.right==null) {
			return;
		}
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	}
	public static void printTree(BinaryTreeNode<Integer> root){
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
		root.left =rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> oneright =new BinaryTreeNode<Integer>(7);
		BinaryTreeNode<Integer> oneleft =new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(5);
		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(6);
		rootleft.right=tworight;
		rootleft.left=oneleft;
		rootright.right=oneright;
		rootright.left =twoleft;
		mirrorBinaryTree(root);
		printTree(root);
//		printTreeDetailed(root);

	}

}
