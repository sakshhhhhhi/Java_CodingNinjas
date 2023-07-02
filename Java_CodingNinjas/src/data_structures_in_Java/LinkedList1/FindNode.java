package data_structures_in_Java.LinkedList1;

public class FindNode {
	public static int findNode(Node<Integer> head, int n) {
		// Write your code here.
		int count=0;
		Node<Integer> temp=head;
		if(temp==null){
			return -1;
		}
		while(temp!=null && temp.data!=n)
        {
            temp=temp.next;
            count++;
        }
        if(temp!=null)
            return count;
        else
            return -1;
	}

}
