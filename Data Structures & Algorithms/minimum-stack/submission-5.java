class MinStack {
    /*first initialize a stack and redefine in the minstack func
    then do the normal push, pop, and peek
    while values get pushed in stack, if a value is less than the currently top value
    in minStack then put that there
    do the same while popping if the val = minstack.peek then pop it 
    in getMin we return the top value in the minStack
    */
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
        
    }
    
    public void push(int val) {
        stack.push(val);

        if(minStack.isEmpty() || val <= minStack.peek()){
            minStack.push(val);
        }
        
    }
    
    public void pop() {
        int val = stack.pop();
        if (val == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {

    return stack.peek();
        
    }
    
    public int getMin() {

        int val = minStack.peek();
        return val;
        
    }
}
