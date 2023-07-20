package data_structures_in_Java.Trees;

public class NumberOfNodes {
	public static int numOfNodes(TreeNode<Integer> root) {
		int count =1;
		for(int i =0;i<root.children.size();i++) {
			int childCount =numOfNodes(root.children.get(i));
			count+=childCount;
		}
		return count;
	}

}
