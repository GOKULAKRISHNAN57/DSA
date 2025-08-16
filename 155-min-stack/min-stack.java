import java.util.Stack;

class Pair{
    int val;
    int min;
    Pair(int val, int min){
        this.val = val;
        this.min = min;
    }
}

class MinStack {

    Stack<Pair> stack = new Stack<>();
    public int minimum = Integer.MAX_VALUE;
    public MinStack() {

    }
    
    public void push(int val) {
        if(val < minimum){
            minimum = val;
        }
        stack.push(new Pair(val,minimum)); 
    }
    
    public void pop() {
        Pair popped = stack.pop();
        if (popped.min == minimum) {
            minimum = stack.isEmpty() ? Integer.MAX_VALUE : stack.peek().min;
        }
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */