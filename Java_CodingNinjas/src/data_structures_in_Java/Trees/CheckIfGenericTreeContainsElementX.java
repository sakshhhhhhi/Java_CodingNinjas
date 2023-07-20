package data_structures_in_Java.Trees;
import java.util.*;
public class CheckIfGenericTreeContainsElementX {
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if(root==null) {
			return false;
		}
		Queue<TreeNode<Integer>> nodes = new LinkedList<>(); 
		nodes.add(root);
		nodes.add(null);
		while(!nodes.isEmpty()) {
			TreeNode<Integer> front = nodes.remove();
			if(front==null) {
				if(nodes.isEmpty()){
					break;
				}
				nodes.add(null);
			}
			else {
				if(front.data==x) {
					return true;
				}
				for(int i =0;i<front.children.size();i++) {
					nodes.add(front.children.get(i));
				}
			}
		}
		return false;
	}

}
