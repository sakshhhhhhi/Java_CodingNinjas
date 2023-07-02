package data_structures_in_Java.LinkedList1;

import java.util.Scanner;

public class TakeInput {
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
			  tail=tail.next;
		    }
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
