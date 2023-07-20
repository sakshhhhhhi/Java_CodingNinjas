package data_structures_in_Java.Trees;

public class findHeight {
	public static int getHeight(TreeNode<Integer> root){
		int height =0;
		if(root==null) {
			return 0;
		}
		if(root.children==null) {
			return 1;
		}
		for(int i =0;i<root.children.size();i++) {
			TreeNode<Integer> child = root.children.get(i);
			height = Math.max(height, getHeight(child));
		}
		return 1+height;
	}

}
