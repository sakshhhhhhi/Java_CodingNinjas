package data_structures_in_Java.Stacks;

import java.util.*;
public class ReverseStack {
	public static void reverseStack(Stack<Integer> input, Stack<Integer> empty) {

		if (input.size()==0 || input.size()==1)
        {
            return;
        }
        
        int top=input.pop();
        reverseStack(input,empty);
        
        while(!input.isEmpty())
        {
            empty.push(input.pop());
        }
        input.push(top);
        
        while(!empty.isEmpty())
        {
            input.push(empty.pop());
        }
	}

}
