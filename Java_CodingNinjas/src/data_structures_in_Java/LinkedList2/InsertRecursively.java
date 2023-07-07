package data_structures_in_Java.LinkedList2;

import java.util.Scanner;

public class InsertRecursively {
	public static void printR(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);
		
		
	}
	public static Node<Integer> insertR(Node<Integer> head,int elem,int pos){
		if(head==null&&pos>0) {
			return head;
		}
		if(pos==0) {
			Node<Integer> NewNode= new Node<>(elem);
			NewNode.next=head;
			return NewNode;
		}
		else {
			head.next=insertR(head.next,elem,pos-1);
			return head;
		}
		
		
	}
	public static Node<Integer> input(){
		Scanner sc = new Scanner(System.in);
		
		int data= sc.nextInt();
		
		Node<Integer> head =null,tail=null;
		while(data!=-1) {
			Node<Integer> currNode = new Node<Integer>(data);
		    if(head==null) {
			  head=currNode;
			  tail=currNode;
		    }
		    else {
		    	
			  tail.next=currNode;
			  tail=currNode;
		    }
		    data=sc.nextInt();
		}
		return head;
	}
	
	
	public static void main(String args[]) {
		Node<Integer> head= input();
		head=insertR(head,20,2);
		printR(head);
	}

}
