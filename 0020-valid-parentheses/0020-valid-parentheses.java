class Solution {
    public static boolean isValid(String sn) {
       Stack<Character> stack=new Stack<>();
       for(char ch:sn.toCharArray()) {
        if(ch=='(' || ch=='[' || ch=='{'){
            stack.push(ch);
        }else{
            if(stack.isEmpty()){
                return false;
            }
            char top=stack.pop();
            if(ch==')' && top!='('){
                return false;
            }
            if(ch==']' && top!='['){
                return false;
            }
            if(ch=='}' && top!='{'){
                return false;
            }
        }
       } 
        return stack.isEmpty();
    }
}
