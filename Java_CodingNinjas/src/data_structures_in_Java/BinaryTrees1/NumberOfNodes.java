package data_structures_in_Java.BinaryTrees1;

public class NumberOfNodes {
	public static int NumNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int LeftNodes = NumNodes(root.left);
		int RightNodes=NumNodes(root.right);
		return 1+LeftNodes+RightNodes;
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
		System.out.println(NumNodes(root));
//		printTreeDetailed(root);

	}

}
