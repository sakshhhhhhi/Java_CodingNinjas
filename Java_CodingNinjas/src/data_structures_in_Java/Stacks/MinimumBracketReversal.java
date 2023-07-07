package data_structures_in_Java.Stacks;
import java.util.*;
public class MinimumBracketReversal {
	public static int countBracketReversals(String input) {
		//Your code goes here
		int len = input.length();

		if(len%2!=0){
			return -1;
		}
		Stack<Character> st = new Stack<Character>();
		for(int i =0;i<input.length();i++){
			char c =input.charAt(i);
			if (c == '}' && !st.empty()) {
                if (st.peek() == '{')
                    st.pop();
                else
                    st.push(c);
            }
            else
                st.push(c);
        }
		
        int new_len = st.size();

        int n = 0;
        while (!st.empty() && st.peek() == '{') {
            st.pop();
            n++;

		}
		return (new_len / 2 + n % 2);
	}

}
