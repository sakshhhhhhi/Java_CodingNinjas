package data_structures_in_Java.Trees;

import java.util.*;

public class TreeTest {
	
	public static TreeNode<Integer> TakeInput(){
		
		Scanner sc = new Scanner(System.in);
		
		Queue<TreeNode<Integer>> nodesToprint = new LinkedList<>();
		System.out.println("Enter the root");
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		
		nodesToprint.add(root);
		while(!nodesToprint.isEmpty()) {
			TreeNode<Integer> front = nodesToprint.remove();
			System.out.println("Enter no of children of :" + front.data);
		    int numOfChildren = sc.nextInt();
		    for(int i =0;i<numOfChildren;i++) {
		    	System.out.println("Enter the "+i+"th child");
		    	int ChildData =sc.nextInt();
		    	TreeNode<Integer> childNode = new TreeNode<Integer>(ChildData);
		    	front.children.add(childNode);
		    	nodesToprint.add(childNode);
		    }
		}
		return root;
	}
	public static void printTree(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		for(int i =0;i<root.children.size();i++) {
			TreeNode<Integer> child =root.children.get(i);
			printTree(child);
		}
	}
	
	public static void printTreeDetailed(TreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+": ");
		for(int i =0;i<root.children.size();i++) {
			System.out.print( root.children.get(i).data+" ");
		}
		System.out.println();
		for(int i =0;i<root.children.size();i++) {
			TreeNode<Integer> child =root.children.get(i);
			printTreeDetailed(child);
		}
	}

	public static void main(String[] args) {
//		TreeNode<Integer> root = new TreeNode<>(4);
//		TreeNode<Integer> node1 = new TreeNode<>(2);
//		TreeNode<Integer> node2 = new TreeNode<>(3);
//		TreeNode<Integer> node3 = new TreeNode<>(1);
//		TreeNode<Integer> node4 = new TreeNode<>(5);
//		TreeNode<Integer> node5 = new TreeNode<>(6);
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		node2.children.add(node5);
		TreeNode<Integer> root = TakeInput(); 
		printTreeDetailed(root);

	}


}
