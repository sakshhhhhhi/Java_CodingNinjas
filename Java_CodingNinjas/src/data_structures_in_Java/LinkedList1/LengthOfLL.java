package data_structures_in_Java.LinkedList1;

public class LengthOfLL {
	public static int length(Node<Integer> head) {
		int length=0;
		while(head!=null) {
			length++;
			head=head.next;
		}
		
		return length;
	}
}
