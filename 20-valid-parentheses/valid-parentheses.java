import java.util.Stack;
class Solution {
    public boolean isValid(String s) {

        if(s.length() == 1) { return false; }

        Stack<Character> stc = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
    
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stc.push( s.charAt(i)  );
            }

            else{

            if(stc.isEmpty()){
                return false;
            }
            
            if(stc.peek() == '{' && s.charAt(i) == '}' || 
            stc.peek() == '(' && s.charAt(i) == ')' || 
            stc.peek() == '[' && s.charAt(i) == ']'){
                stc.pop();
            }
            else{
                return false;
            }

            }

        }

        if(stc.isEmpty()){
            return true;
        }
        return false;
    }
}