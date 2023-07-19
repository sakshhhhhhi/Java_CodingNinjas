package data_structures_in_Java.BST2;

import java.util.*;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;

public class LevelWiseLinkedList {
	private static ArrayList<LinkedListNode<Integer>> arrLst = new ArrayList<>();
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		Queue <BinaryTreeNode<Integer>> printNode = new LinkedList<>();
		printNode.add(root);
		printNode.add(null);
		LinkedListNode<Integer> head = null, tail=null;
		while(!printNode.isEmpty()) {
			BinaryTreeNode<Integer> front = printNode.poll();
			if(front==null) {
				printNode.add(null);
				tail.next=null;
				tail=tail.next;
				head=null;
			}
			else {
				if(head==null) {
					head = new LinkedListNode<Integer>(front.data);
					tail=head;
					arrLst.add(head);
				}
				else {
					tail=new LinkedListNode<Integer>(front.data);
					tail=tail.next;
				}
				if(front.left!=null) {
					printNode.add(front.left);
				}
				if(front.right!=null) {
					printNode.add(front.right);
				}
			}
		}
		
		
				
				
		return arrLst;
	}

}
