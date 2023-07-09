package data_structures_in_Java.Test2;

import data_structures_in_Java.LinkedList2.Node;

public class DeleteAlternateNodes {
	 public static void deleteAlternateNodes(Node<Integer> head) {
		 if(head!=null) {
		 head.next=head.next.next;
		 head=head.next;
		 }
		 else {
			 head.next=null;
		 }
	 }
}
