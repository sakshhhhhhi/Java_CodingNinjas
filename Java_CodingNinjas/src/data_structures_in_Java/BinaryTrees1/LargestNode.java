package data_structures_in_Java.BinaryTrees1;

public class LargestNode {
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int largestleft=largest(root.left);
		int largestright=largest(root.right);
		return Math.max(root.data, Math.max(largestleft, largestright));
	
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(6);
		root.left =rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(5);
		rootleft.right=tworight;
		rootright.left =twoleft;
		System.out.println(largest(root));

	}

}
