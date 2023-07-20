package data_structures_in_Java.Trees;

import java.util.*;

public class NumberOfNodesGreaterThanX {
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		if(root==null) {
			return 0;
		}
		int count=0;
		Queue<TreeNode<Integer>> nodes = new LinkedList<>();
		nodes.add(root);
		nodes.add(null);
		
		while(!nodes.isEmpty()) {
			TreeNode<Integer> front = nodes.remove();
			if(front==null) {
				if(nodes.isEmpty()) {
					break;
				}
				nodes.add(null);
			}
			else {
				if(x<front.data) {
					count++;
				}
				for(int i =0;i<front.children.size();i++) {
					nodes.add(front.children.get(i));
				}
			}
		}
		return count;
	}

}
