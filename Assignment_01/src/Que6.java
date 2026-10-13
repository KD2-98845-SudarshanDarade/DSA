import java.util.Stack;

public class Que6 {
	
	public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        String str = "";
        while(!stack.isEmpty()){
            char ch = stack.pop();
            str = ch + str;
        }
        return str;
    }
}
