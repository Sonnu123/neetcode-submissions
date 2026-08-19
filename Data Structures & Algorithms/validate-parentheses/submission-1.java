class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] str = s.toCharArray();
        for(int i = 0; i < str.length; i++){
            if(stack.isEmpty() || str[i] == '[' || str[i] == '(' || str[i] == '{'){
                stack.push(str[i]);
            }
            else if(str[i] == ']' && stack.peek() == '['){
                stack.pop();
            }
            else if(str[i] == '}' && stack.peek() == '{'){
                stack.pop();
            }
            else if(str[i] == ')' && stack.peek() == '('){
                stack.pop();
            }
            else{
                return false;
            }
        }
        if(stack.isEmpty() == true){
            return true;
        }
        return false;
    }
}
