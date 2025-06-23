class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch>='0' && ch<='9'){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}