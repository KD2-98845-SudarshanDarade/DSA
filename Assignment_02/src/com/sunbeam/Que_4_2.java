package com.sunbeam;

import java.util.Stack;

public class Que_4_2 {

    public static int evaluate(int op2, int op1, String operator) {

        switch(operator) {
            case "+" : return op1 + op2;
            case "-" : return op1 - op2;
            case "*" : return op1 * op2;
            case "/" : return op1 / op2;
        }

        return -1;
    }

    public static int evalPrefix(String[] tokens) {

        int n = tokens.length;
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            if(!tokens[i].equals("*")
                && !tokens[i].equals("-")
                && !tokens[i].equals("/")
                && !tokens[i].equals("+")) {

                int num = Integer.parseInt(tokens[i]);
                stack.push(num);

            } else {

                int op1 = stack.pop();
                int op2 = stack.pop();

                int result = evaluate(op1, op2, tokens[i]);
                stack.push(result);
            }
        }

        return stack.pop();
    }
    public static void main(String[] args) {
        String tokens = "* + 12 5 3";
        String newString[] = tokens.split(" ");
        int result = evalPrefix(newString);
        System.out.println("Result : " + result);
    }
}