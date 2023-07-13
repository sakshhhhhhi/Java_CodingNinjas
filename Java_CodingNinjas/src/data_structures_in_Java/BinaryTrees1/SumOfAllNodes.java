package data_structures_in_Java.BinaryTrees1;

public class SumOfAllNodes {
	public static int sum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftsum = sum(root.left);
		int rightsum = sum(root.right);
		return leftsum+rightsum+root.data;
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
		root.left =rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(5);
		rootleft.right=tworight;
		rootright.left =twoleft;
		System.out.println(sum(root));
	}

}
