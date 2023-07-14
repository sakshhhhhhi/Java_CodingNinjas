package data_structures_in_Java.BinaryTrees2;

public class CreateAndInsertDuplicateNode {
	
		public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
			if(root==null){
				return;
			}
			BinaryTreeNode<Integer> Duplicate =new BinaryTreeNode<Integer>(root.data);
			BinaryTreeNode<Integer> storedLeft =root.left;
			
			root.left=Duplicate;
			Duplicate.left=storedLeft;
			insertDuplicateNode(root.left.left);
			insertDuplicateNode(root.right);
		}
		
	
	}


