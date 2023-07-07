package data_structures_in_Java.LinkedList2;

import java.util.Scanner;

public class DeleteNodeRecursively {
	public static void printR(Node<Integer> head) {
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);
		
		
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
	
	public static Node<Integer> deleteR(Node<Integer> head, int pos){
		if(head==null) {
			return head;
		}
		if(pos==0) {
			return head.next;
		}
		if(pos>0&&head!=null){
			head.next=deleteR(head.next,pos-1);
		}
		return head;
		
	}

	public static void main(String[] args) {
		Node<Integer> head= input();
		head=deleteR(head,2);
		printR(head);

	}

}
