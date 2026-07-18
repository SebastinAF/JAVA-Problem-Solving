package BackTracking;

import java.util.Stack;

class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value < minStack.peek()) minStack.push(value);
        else minStack.push(minStack.peek());
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class MinStackMain {

    public static void main(String[] args) {
        MinStack min = new MinStack();

        min.push(-2);
        min.push(0);
        min.push(-3);
        int param_4 = min.getMin();
        System.out.println(param_4);
        min.pop();
        int param_3 = min.top();
        System.out.println(param_3);
        int param_41 = min.getMin();
        System.out.println(param_41);
    }
}
