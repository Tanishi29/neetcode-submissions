class Solution {
    public int evalRPN(String[] tokens) {

        /*
        need to check first if the string is an int or no with a try-catch
        then i push each int into the stack and as the loop moves
        if  i reach an operand i perform the operation 
        always larger - small & larger/small for sub and div and push the 
        res into the stack if it will be used again..
        then return the final result by stack.peek()
        */

        int res = 0;
        int op1 = 0; 
        int op2 = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            
            try {
            int parsedInt = Integer.parseInt(tokens[i]);
            stack.push(parsedInt);
                }
                       catch (NumberFormatException e) {
                System.out.println("invalid integer bruv");
                }
        
        if(tokens[i].equals("+")){
            op1 = stack.pop();
            op2 = stack.pop();
            res = op1 + op2;
            stack.push(res);
        }

        if(tokens[i].equals("-")){
            op1 = stack.pop();
            op2 = stack.pop();
            res = op2 - op1;
            stack.push(res);
        }
        if(tokens[i].equals("/")){
            op1 = stack.pop();
            op2 = stack.pop();
            res = op2 / op1;
            stack.push(res);
        }  
        if(tokens[i].equals("*")){
            op1 = stack.pop();
            op2 = stack.pop();
            res = op1 * op2;
            stack.push(res);
        } 


            }

        res = stack.peek();
        return res;
        
    }
}
