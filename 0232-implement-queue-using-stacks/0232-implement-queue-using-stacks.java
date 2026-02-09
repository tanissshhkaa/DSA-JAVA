class MyQueue {
    private Stack<Integer> in_stack;
    private Stack<Integer> out_stack;
    public MyQueue() {
        in_stack=new Stack<>();
        out_stack=new Stack<>();
    }
    private void transfer() {
        while(!in_stack.isEmpty()){
            out_stack.push(in_stack.pop());
        }
    }
    public void push(int x) {
        in_stack.push(x);
    }
    
    public int pop() {
        if(out_stack.isEmpty()){
            transfer();
        }
        return out_stack.pop();
    }
    
    public int peek() {
        if(out_stack.isEmpty()){
            transfer();
        }
        return out_stack.peek();
    }
    
    public boolean empty() {
          return in_stack.isEmpty() && out_stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */