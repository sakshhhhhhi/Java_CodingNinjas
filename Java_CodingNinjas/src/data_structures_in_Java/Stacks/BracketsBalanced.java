package data_structures_in_Java.Stacks;
import java.util.Stack;
public class BracketsBalanced {
	public static boolean isBalanced(String expression) {
//        Stack<Character> st = new Stack<>();
//        for(int i=0;i<expression.length();i++) {
//        	char j = expression.charAt(i);
//        	if(j=='('||j=='{'|| j=='[') {
//        		st.push(j);
//        	}
//        	else if(j==')'||j=='}'|| j==']') {
//        		if(st.isEmpty()) {
//        			return false;
//        		}
//        		else {
//        			if(j==')') {
//        				if(st.peek()!='(') {
//        					return false;
//        				}
//        				else {
//        					st.pop();
//        				}
//        			}
//        			if(j=='}') {
//        				if(st.peek()!='{') {
//        					return false;
//        				}
//        				else {
//        					st.pop();
//        				}
//        			}
//        			if(j==']') {
//        				if(st.peek()!='[') {
//        					return false;
//        				}
//        				else {
//        					st.pop();
//        				}
//        			}
//        		}
//        	}
//        }
//        return st.isEmpty();
		Stack<String> st = new Stack<>();
        for(int i =0;i<expression.length();i++){
            if(expression.charAt(i)=='('){
                st.push("(");
            }
            if(expression.charAt(i)==')'){
            	if(st.isEmpty()) {
            		return false;
            	}
                st.pop();
            }
           
        }
         return st.isEmpty();
    }

	public static void main(String[] args) {
		System.out.println(isBalanced("(())()"));

	}

}
