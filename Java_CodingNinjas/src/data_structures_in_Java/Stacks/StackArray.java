package data_structures_in_Java.Stacks;

public class StackArray extends StackUsingArray {

	public static void main(String[] args) throws StackEmptyException, fullStackException {
		StackUsingArray stack = new StackUsingArray();
//		stack.isEmpty();
//		stack.top();
		stack.push(4);
		
		System.out.print(stack.pop());
//		stack.size();

	}

}
