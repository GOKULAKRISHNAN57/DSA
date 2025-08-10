import java.util.Stack;
public class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(stack1.isEmpty()){
            stack1.push(x);
            return;
        }

        while(!stack1.isEmpty()){
            int element = stack1.pop();
            stack2.push(element);
        }

        stack1.push(x);

        while(!stack2.isEmpty()){
            int element = stack2.pop();
            stack1.push(element);
        }

    }
    
    public int pop() {


        return stack1.pop();
    }
    
    public int peek() {
        if(stack1.isEmpty()){
            return -1;
        }
        return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
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