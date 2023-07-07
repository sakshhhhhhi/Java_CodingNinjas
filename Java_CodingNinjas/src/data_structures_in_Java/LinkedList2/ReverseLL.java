package data_structures_in_Java.LinkedList2;

public class ReverseLL {
	public static Node<Integer> reverseRec(Node<Integer> head) {
		//Your code goes here
        if(head==null){
            return head;
        }
        if(head.next==null)
            return head;
        Node<Integer> tail=head.next;
        Node<Integer> smallhead=reverseRec(head.next);
        tail.next=head;
        head.next=null;
        return smallhead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
