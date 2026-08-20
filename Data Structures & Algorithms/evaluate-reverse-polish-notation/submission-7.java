class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int y = 0;
        for(String s : tokens){
            if(s.equals("+")){
                y = stack.pop() + stack.pop();
                stack.push(y);
            }
            else if(s.equals("-")){
                int z = stack.pop();
                y = stack.pop() - z;
                stack.push(y);
            }
            else if(s.equals("*")){
                y = stack.pop() * stack.pop();
                stack.push(y);
            }
            else if(s.equals("/")){
                int z = stack.pop();
                y = stack.pop() / z;
                stack.push(y);
            }
            else{
                int x = Integer.parseInt(s);
                stack.push(x);
            }
        }
        return stack.pop();
    }
}
