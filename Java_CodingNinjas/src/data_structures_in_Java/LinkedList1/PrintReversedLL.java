package data_structures_in_Java.LinkedList1;

public class PrintReversedLL {
	public static void printReverse(Node<Integer> root) {
		if(root==null) {
			return;
		}
		printReverse(root.next);
		System.out.println(root.data+" ");
	}

}
