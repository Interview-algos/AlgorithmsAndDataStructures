package stringpkg;

import java.util.Stack;

public class OpenCloseParenthesisProblemUsingStack {
	
	public static boolean checkParentesis(String str){
		
		if (str.isEmpty())
			return true;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++){
			char current = str.charAt(i);
			
			if(current == '(' || current == '{' || current == '['){
				stack.push(current);
			}else if (current == ')' || current == '}' || current == ']'){
				if (stack.isEmpty())
					return false;
				char last = stack.peek();
				if ((current==')' && last=='(')||(current=='}' && last=='{')||
						(current==']' && last=='['))
					stack.pop();
				else
					return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String args[]){		
		System.out.println(checkParentesis("({})"));//true		
		System.out.println(checkParentesis("(()){}()")); //true		
		System.out.println(checkParentesis("(())")); //true		
		System.out.println(checkParentesis("(()"));//false		
		System.out.println(checkParentesis("({}("));//false		
		System.out.println(checkParentesis("){})"));//false		
	}

}
