class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i<s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            else if(s.charAt(i) == ')' && stack.peek() == '(' || s.charAt(i) == '}' && stack.peek() == '{' || s.charAt(i) == ']' && stack.peek() == '['){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
