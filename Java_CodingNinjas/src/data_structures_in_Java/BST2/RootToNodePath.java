package data_structures_in_Java.BST2;

import java.util.ArrayList;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class RootToNodePath {
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x ){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> path =new ArrayList<>();
			path.add(root.data);
			return path;
		}
		ArrayList<Integer> LeftPath = nodeToRootPath(root.left,x);
		if(LeftPath!=null) {
			LeftPath.add(root.data);
			return LeftPath;
		}
		ArrayList<Integer> RightPath = nodeToRootPath(root.right,x);
		if(RightPath!=null) {
			RightPath.add(root.data);
			return RightPath;
		}
		return null;
		
		
	}

}
