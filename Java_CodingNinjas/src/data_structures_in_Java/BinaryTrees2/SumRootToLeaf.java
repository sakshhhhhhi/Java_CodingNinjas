package data_structures_in_Java.BinaryTrees2;

public class SumRootToLeaf {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		String str ="";
		rootToLeafPathsSumToK(root, k ,str);
	}

	private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String str) {
		if(root==null) {
			return;
		}
		int rootData=root.data;
		str=str+rootData+" ";
		if(k==rootData&&root.left==null&&root.right==null) {
			System.out.println(str);
			return;
		}
		rootToLeafPathsSumToK(root.left, k-rootData,  str); 
		rootToLeafPathsSumToK(root.right, k-rootData,  str);
	}

}
