package data_structures_in_Java.BinaryTrees1;

public class NodesGreaterThanX {
	public static int greater(BinaryTreeNode<Integer> root,int x) {
		if(root==null) {
			return 0;
		}
		int smaller =greater(root.left,x)+greater(root.right,x);
		if(root.data>x) {
			return smaller+1;
		}
		else {
			return smaller;
		}
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
		System.out.println(greater(root,8));

	}

}
