package data_structures_in_Java.BinaryTrees1;

import java.util.Scanner;

public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
		System.out.println("Enter root data");
		}
		else {
			if(isLeft) {
				System.out.println("Enter left child of "+parentData);
			}
			else {
				System.out.println("Enter right child of "+parentData);
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild =takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild =takeTreeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter root data");
		Scanner sc = new Scanner(System.in);
		int rootData = sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild =takeTreeInput();
		BinaryTreeNode<Integer> rightChild =takeTreeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root){
		if(root==null) {
			return;
		}
		System.out.print(root.data+" : ");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	public static void printTree(BinaryTreeNode<Integer> root){
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
//		if(root.left!=null) {
////		printTree(root.left);
////		}
////		if(root.right!=null){
////			printTree(root.left);
////		}
		
	}
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
//		root.left =rootleft;
//		root.right=rootright;
//		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(5);
//		rootleft.right=tworight;
//		rootright.left =twoleft;
		BinaryTreeNode<Integer> root =takeTreeInputBetter(true,1,true);
		printTreeDetailed(root);
		
	}

}

