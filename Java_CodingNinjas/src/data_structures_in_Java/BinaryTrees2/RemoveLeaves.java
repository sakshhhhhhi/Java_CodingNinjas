package data_structures_in_Java.BinaryTrees2;
public class RemoveLeaves {
	public static BinaryTreeNode<Integer> removeleaves(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return null;
		}
		if(root.left==null&&root.right==null) {
			return null;
		}
		root.left=removeleaves(root.left);
		root.right=removeleaves(root.right);
		return root;
	}
	public static void printTree(BinaryTreeNode<Integer> root){
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}

//	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
//		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
//		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(6);
//		root.left =rootleft;
//		root.right=rootright;
//		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
//		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(5);
//		rootleft.right=tworight;
//		rootright.left =twoleft;
//		BinaryTreeNode<Integer> newNode =removeleaves(root);
//		printTree(newNode);
//		
//
//	}

}
