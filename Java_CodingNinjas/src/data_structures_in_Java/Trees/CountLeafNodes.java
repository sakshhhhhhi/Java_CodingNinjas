package data_structures_in_Java.Trees;

public class CountLeafNodes {
	public static int countLeafNodes(TreeNode<Integer> root){
		int count =0;
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0) {
			return 1;
		}
		for(int i =0;i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			count+=countLeafNodes(child);
		}
		
		return count;
	}

}
