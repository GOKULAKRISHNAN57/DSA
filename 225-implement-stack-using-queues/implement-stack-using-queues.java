import java.util.ArrayDeque;
import java.util.Queue;
class MyStack {

    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();


    public MyStack() {
        
    }
    
    public void push(int x) {
        if(queue1.isEmpty()){
            queue1.add(x);
            return;
        }
        while(!queue1.isEmpty()){
            int num = queue1.remove();
            queue2.add(num);
        }
        queue1.add(x);
        while(!queue2.isEmpty()){
            int num = queue2.remove();
            queue1.add(num);
        }
    }
    
    public int pop() {
        return queue1.remove();
    }
    
    public int top() {
        return queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */