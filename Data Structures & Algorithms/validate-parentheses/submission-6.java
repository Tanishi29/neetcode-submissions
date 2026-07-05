class Solution {
    public boolean isValid(String s) {

        /*
        since it is a stack problem, we will put the openning brackets in order in to the stack
        and then keep on going for the closing ones in the for loop
        if the closing bracket doesn't have an opening bracket then return false

        */

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            else {
                if(stack.isEmpty()){
                    return false;
                }

                char pop = stack.pop();

                if(c == ')' && pop != '('){
                    return false;
                }
                if(c == '}' && pop != '{'){
                    return false;
                }
                if(c == ']' && pop !='['){
                    return false;
                }
            }
        }
        return stack.isEmpty();

        
    }
}
