package com.sunbeam;
import java.util.Stack;
public class Que_4_1 {
	 public static int evaluate(int op2 ,int op1 ,String operator){
	        switch(operator){
	            case "+" : return op1 + op2;
	            case "-" : return op1 - op2;
	            case "*" : return op1 * op2;
	            case "/" : return op1 / op2;
	        }
	        return -1;
	    }
	    
	    public static int evalRPN(String[] tokens) {
	        int n = tokens.length;
	        
	        Stack<Integer> stack = new Stack<>();

	        for(int i = 0 ; i < n ; i++){
	            if(!tokens[i].equals("*")
	                && !tokens[i].equals("-") 
	                && !tokens[i].equals("/")
	                && !tokens[i].equals("+")  ){
	                int num = Integer.parseInt(tokens[i]);
	                stack.push(num);
	            }else{
	                int op2 = stack.pop();
	                int op1 = stack.pop();
	                int result = evaluate(op2 , op1 , tokens[i]);
	                stack.push(result);
	            }
	        }
	        return stack.pop();
	    }
	    
	    public static void main(String[] args) {
	    	String tokens = "2 1 + 3 *";
	    	String newString[] = tokens.split(" ");
	    	int result = evalRPN(newString);
	    	System.out.println("Result is : " + result);
		}
}
