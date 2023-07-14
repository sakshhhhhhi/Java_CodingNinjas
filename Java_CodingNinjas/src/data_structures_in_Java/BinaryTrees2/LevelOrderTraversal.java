package data_structures_in_Java.BinaryTrees2;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		 if (root==null)
	            return;
	        
	        Queue<BinaryTreeNode<Integer>> nodesToPrint = new LinkedList<BinaryTreeNode<Integer>>();
	        nodesToPrint.add(root);
	        nodesToPrint.add(null);
	        while(!nodesToPrint.isEmpty())
	        {
	            BinaryTreeNode<Integer> front=nodesToPrint.poll();
	            if (front==null)
	            {
	                if (nodesToPrint.isEmpty())
	                    break;
	                else
	                {
	                    System.out.println();
	                	nodesToPrint.add(null);
	                }
	                
	            }
	            else
	            {
	                System.out.print(front.data+" ");
	                if (front.left!=null)
	                    nodesToPrint.add(front.left);
	                if (front.right!=null)
	                    nodesToPrint.add(front.right);
	            }
	        }
	}


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft =new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright =new BinaryTreeNode<Integer>(3);
		root.left =rootleft;
		root.right=rootright;
		BinaryTreeNode<Integer> tworight =new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> twoleft =new BinaryTreeNode<Integer>(5);
		rootleft.right=tworight;
		rootright.left =twoleft;
		printLevelWise(root);
	}
}
