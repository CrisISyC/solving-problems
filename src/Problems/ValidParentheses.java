package Problems;

/*
 *Problem
 https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {
    
    static class Stack{
        
        char stack[];
        int top;
        
        public Stack(int size){
            this.stack = new char[size];
            this.top = -1;
        }
        
        public boolean isEmpty(){
            return top == -1;
        }
        
        public void push(char c){
            if(top < stack.length -1){
               this.stack[++top] = c;    
            }        
        }
        
        public char pop(){
            return stack[top--];
        }
         
    }
 
    public static boolean solution(String s){
        
        Stack stack = new Stack(s.length());
        
        for(int i = 0; i < s.length(); i++){
            
            char parent = s.charAt(i);
            
            if(parent == '(' || parent == '{' || parent == '['){
                stack.push(parent);
                continue;
            }
            
            if(stack.isEmpty()){
                return false;
            }
            
            if(parent == ')'){
                if(stack.pop() == '('){
                    continue;
                }
                return false;
            }else if(parent == '}'){
                if(stack.pop() == '{'){
                    continue;
                }
                return false;
            }else if(parent == ']'){
                if(stack.pop() == '['){
                    continue;
                }
                return false;
            }
            
        }
        
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
