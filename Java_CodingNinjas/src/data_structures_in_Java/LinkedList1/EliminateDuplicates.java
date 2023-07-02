package data_structures_in_Java.LinkedList1;

public class EliminateDuplicates {
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head==null) {
			return head;
		}
		if(head.next==null) {
			return head;
		}
		Node<Integer> n1=head,n2=head.next;
		Node<Integer> h1=head;
		while(n2!=null) {
			if(n1.data.equals(n2.data)) {
				n2=n2.next;
			}
			else {
				n1.next=n2;
				n1=n2;
			}
			
		}
		n1.next=null;
		return h1;
	}

}
