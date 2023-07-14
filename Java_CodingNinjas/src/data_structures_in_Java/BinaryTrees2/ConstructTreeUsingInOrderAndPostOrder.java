package data_structures_in_Java.BinaryTrees2;

public class ConstructTreeUsingInOrderAndPostOrder {
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0, postOrder.length, 0, inOrder.length);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int[]postOrder,int[]inOrder,int siPost,int eiPost,int siIn,int eiIn){
		if(siPost>eiPost){
			return null;
		}
		int rootData = postOrder[postOrder.length-1];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		//finding root Index

		int rootIndex =-1;
		for(int i =siIn;i<=eiIn;i++){
		if(rootData==inOrder[i]){
			rootIndex=i;
			break;
		}
		}
		//finding Indices of Inorder left SubTree
		int siInleft = siIn;
		int eiInleft = rootIndex-1;

		//finding Indices of Inorder right SubTree

		int siInright =rootIndex+1;
		int eiInright =eiIn;

		//finding Indices of PostOrder of left SubTree
		int siPostleft = siPost;
		int leftSubTreelength=(eiInleft-siInleft)+1;
		int eiPostleft = (siPostleft)+(leftSubTreelength-1);

		//finding Indices of PostOrder of right SubTree
		int siPostright = eiPostleft+1;
		int eiPostright = eiPost-1;

		BinaryTreeNode<Integer> leftSubTree = buildTree(postOrder, inOrder, siPostleft, eiPostleft, siInleft, eiInleft) ;
		BinaryTreeNode<Integer> rightSubTree = buildTree(postOrder, inOrder, siPostright, eiPostright, siInright, eiInright);
		root.left=leftSubTree;
		root.right=rightSubTree;
		return root;

	}

}
