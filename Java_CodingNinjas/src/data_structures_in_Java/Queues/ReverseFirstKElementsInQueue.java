package data_structures_in_Java.Queues;

import java.util.*;

public class ReverseFirstKElementsInQueue {
	public static Queue<Integer> reverseKElements(Queue<Integer> input,int k ){
		Stack<Integer> st = new Stack<Integer>();
		Queue<Integer> res = new LinkedList<Integer>();
		while(!input.isEmpty()&&(k-->0)) {
			st.push(input.remove());
		}
		while(!st.isEmpty()) {
			res.add(st.pop());
		}
		while(!input.isEmpty()) {
			res.add(input.remove());
		}
		return res;
	}

	public static void main(String[] args) {
		Queue<Integer> input = new LinkedList<>();
		input.add(10);
		input.add(20);
		input.add(30);
		input.add(40);
		input.add(50);
		input.add(60);
		input.add(70);
		input.add(80);
		input.add(90);
		
		System.out.print(reverseKElements(input,4));

	}

}
