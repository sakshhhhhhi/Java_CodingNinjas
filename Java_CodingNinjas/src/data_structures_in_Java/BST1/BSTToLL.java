package data_structures_in_Java.BST1;

import data_structures_in_Java.BinaryTrees1.BinaryTreeNode;
import data_structures_in_Java.LinkedList2.Node;

public class BSTToLL {
	public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair ans=helper(root);
	        return ans.head;
	}
	public static Pair helper(BinaryTreeNode<Integer> root){
	        if(root==null)
	        {
	            Pair output=new Pair();
	            output.head=null;
	            output.tail=null;
	            return output;
	        }
	        Pair lefttree=helper(root.left);
	        Node<Integer> newNode=new Node<>(root.data);
	        Pair righttree=helper(root.right);
	        Pair output=new Pair();
	        if(lefttree.head!=null){
	           output.head=lefttree.head;
	           lefttree.tail.next=newNode;
	        
	        }
	        else {
	            output.head=newNode;
	        }
	        newNode.next=righttree.head;
	        if(righttree.head==null)
	        {
	            output.tail=newNode;
	            
	        }
	        else{
	            output.tail=righttree.tail;
	        }
	        return output;
	}
	}
	class Pair{
	    Node<Integer> head;
	    Node<Integer> tail;
	}


