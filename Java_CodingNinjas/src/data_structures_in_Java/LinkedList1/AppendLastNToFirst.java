package data_structures_in_Java.LinkedList1;

public class AppendLastNToFirst {
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		if(head==null) {
			return head;
		}
		if(n==0) {		
			return head;
		}
        Node<Integer> temp = head;
        
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        
        int newcount=len-n;
        len=0;
        Node<Integer> temp1=head;
        while(len<newcount-1){
            temp1=temp1.next;
            len++;
        }
        Node<Integer> temp2=temp1.next;
        Node<Integer> temp3=temp1.next;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        temp1.next=null;
        return temp3;
	}

}
