package data_structures_in_Java.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLevelWise {
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> nodes = new LinkedList<>();
		nodes.add(root);
		nodes.add(null);
		
		while(!nodes.isEmpty()) {
			TreeNode<Integer> front = nodes.remove();
			if(front==null) {
				if(nodes.isEmpty()) {
					break;
				}
				System.out.println();
				nodes.add(null);
			}
			else {
				System.out.print(front.data+" ");
				for(int i=0;i<front.children.size();i++){
                    nodes.add(front.children.get(i));
                }
			}
		}

}
}
