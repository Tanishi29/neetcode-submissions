class Solution {
    public int evalRPN(String[] tokens) {

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
                System.out.println("The string is not a valid integer.");
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
