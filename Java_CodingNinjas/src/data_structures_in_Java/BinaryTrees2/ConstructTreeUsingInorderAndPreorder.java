package data_structures_in_Java.BinaryTrees2;

public class ConstructTreeUsingInorderAndPreorder {
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		BinaryTreeNode<Integer>root = buildTree(preOrder, inOrder,0,preOrder.length,0,inOrder.length);
		return root;
	}
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder,int siPre,int eiPre,int siIn, int eiIn) {
		
		if(siPre>eiPre) {
			return null;
		}
		
		int rootData=preOrder[siPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
		
		int rootIndex=-1;
		for(int i =0;i<inOrder.length;i++) {
			if(rootData==inOrder[i]) {
				rootIndex=i;
				break;
			}
		}
		//Indices of InOrder Left SubTree
		int siInleftSub = siIn;
		int eiInLeftSub = rootIndex-1;
		
		//Indices of PreOrder of Left SubTree
		int siPreLeftSub=siPre+1;
    	int leftSubTreeLength = eiInLeftSub - siInleftSub + 1;
    	int eiPreLeftSub=(siPreLeftSub)+(leftSubTreeLength-1);
		
    	//Indices of InOrder Right SubTree
		int siInRightSub = rootIndex+1;
		int eiInRightSub = eiIn;
		
		int siPreRightSub=eiPreLeftSub+1;
    	int eiPreRightSub=eiPre;
    	
    	BinaryTreeNode<Integer> leftChild = buildTree(preOrder, inOrder, siPreLeftSub, eiPreLeftSub, siInleftSub, eiInLeftSub);
    	BinaryTreeNode<Integer> rightChild = buildTree(preOrder, inOrder, siPreRightSub, eiPreRightSub, siInRightSub, eiInRightSub);
    	root.left=leftChild;
    	root.right=rightChild;
    	return root;
				
		
	}

}
