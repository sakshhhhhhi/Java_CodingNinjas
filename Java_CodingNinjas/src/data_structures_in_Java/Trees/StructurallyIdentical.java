package data_structures_in_Java.Trees;

public class StructurallyIdentical {
	private static int NumOfLeafNodes(TreeNode<Integer> root) {
		int nodes =0;
		if(root==null) {
			return nodes;
		}
		for(int i =0;i<root.children.size();i++) {
			int child = NumOfLeafNodes(root.children.get(i));
			nodes+=child;
		}
		return nodes;
	}
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
		if(root1==null||root2==null) {
			return false;
		}
		int a = NumOfLeafNodes(root1),b=NumOfLeafNodes(root2);
		return a==b;
	}

}
