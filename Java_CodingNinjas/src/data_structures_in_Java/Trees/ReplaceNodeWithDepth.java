package data_structures_in_Java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class ReplaceNodeWithDepth {
	public static void replaceWithDepthValue(TreeNode<Integer> root){
		int depth=0;
		if(root==null) {
			return;
		}
		Queue<TreeNode<Integer>> nodes = new LinkedList<>();
		nodes.add(root);
		nodes.add(null);
		while(!nodes.isEmpty()) {
			TreeNode<Integer> front = nodes.remove();
			if(front==null) {
				if(nodes.isEmpty()) {
				break;
				}
				
				depth ++;
				nodes.add(null);
			}

			else {
				front.data=depth;
				for(int i =0;i<front.children.size();i++) {
					nodes.add(front.children.get(i));
				}
			}
		}
		
	}

}
