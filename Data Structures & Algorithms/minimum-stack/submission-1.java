class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> stack1 = new ArrayDeque<>();
    public MinStack() {

    }
    
    public void push(int val) {
        stack.push(val);
        if(stack1.isEmpty()){
            stack1.push(val);
        }
        else{
            if(stack1.peek() >= val){
                stack1.push(val);
            }
        }
    }
    
    public void pop() {
        int val = stack.pop();
        if(val == stack1.peek()){
            stack1.pop();
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack1.peek();
    }
}
