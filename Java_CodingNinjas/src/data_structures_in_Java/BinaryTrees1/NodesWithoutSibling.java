package data_structures_in_Java.BinaryTrees1;

public class NodesWithoutSibling {
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer>root) {
		if(root==null) {
			return;
		}
		if(root.right==null&&root.left!=null) {
			System.out.print(root.left.data+" ");
		}
		else if(root.left==null&&root.right!=null){
			System.out.print(root.right.data+" ");
		}
		printNodesWithoutSibling(root.left);
		printNodesWithoutSibling(root.right);
		
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
		printNodesWithoutSibling(root);

	}

}
