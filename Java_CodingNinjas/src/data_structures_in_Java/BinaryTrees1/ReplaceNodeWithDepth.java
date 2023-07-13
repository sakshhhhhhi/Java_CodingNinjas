package data_structures_in_Java.BinaryTrees1;

public class ReplaceNodeWithDepth {
	public static void replacedepth(BinaryTreeNode<Integer>root) {
		replacedepth(root,0);
	}
	public static void replacedepth(BinaryTreeNode<Integer>root,int k) {
		if(root==null) {
			return;
		}
		root.data=k;
		replacedepth(root.left,k+1);
		replacedepth(root.right,k+1);
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
		replacedepth(root);

	}
	

}
