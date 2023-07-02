package data_structures_in_Java.LinkedList1;

public class Printith {
	public static void ith(Node<Integer> head,int i) {
		int count =0;
		while(head!=null) {
			count++;
			head=head.next;
			if(count==i) {
				System.out.print(head.data);
			}
		
		}
	}

}
