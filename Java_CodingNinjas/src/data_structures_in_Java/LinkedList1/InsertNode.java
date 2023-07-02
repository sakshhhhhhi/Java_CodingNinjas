package data_structures_in_Java.LinkedList1;

public class InsertNode {
	public static Node<Integer> insert(Node<Integer> head, int pos, int data){
		//Your code goes here
		Node<Integer>value = new Node<Integer>(data);
		if(pos==0) {
			value.next=head;
			return value;
		}
		else {
		int count=0;
		Node<Integer>temp=head;
		while(count<pos-1&&temp!=null) {
			count++;
			temp=temp.next;
		}
		if(temp!=null) {
		value.next=temp.next;
		temp.next=value;
		}
		return head;
		}
	}

}
