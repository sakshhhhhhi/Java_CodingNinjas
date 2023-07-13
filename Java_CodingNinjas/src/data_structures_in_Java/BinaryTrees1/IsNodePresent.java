package data_structures_in_Java.BinaryTrees1;

public class IsNodePresent {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return false;
		}
		boolean leftpresent=isNodePresent(root.left,x);
		boolean rightpresent=isNodePresent(root.right,x);
		if(root.data==x) {
			return true;
		}
		else {
			return(leftpresent||rightpresent);
		}
	}

}
