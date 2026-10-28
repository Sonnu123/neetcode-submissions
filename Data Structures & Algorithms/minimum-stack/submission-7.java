class MinStack {
    Deque<Integer> stack1 = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack1.push(val);
        if(stack2.isEmpty()){
            stack2.push(val);
        }
        else if(!stack2.isEmpty() && val <= stack2.peek()){
            stack2.push(val);
        }
    }
    
    public void pop() {
        int a = stack1.pop();
        if(!stack2.isEmpty() && stack2.peek() == a){
            stack2.pop();
        }
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int getMin() {
        return stack2.peek();
    }
}
