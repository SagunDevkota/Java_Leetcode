package leet_code;

import java.util.Stack;

public class ImplementQueueUsingStacksQ232 {

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		System.out.println(myQueue.peek());
		System.out.println(myQueue.pop());
		System.out.println(myQueue.empty());
	}
	static class MyQueue {
	    Stack<Integer> stack;
	    Stack<Integer> dummy;
	    public MyQueue() {
	        stack = new Stack<>();
	        dummy = new Stack<>();
	    }
	    
	    public void push(int x) {
	        stack.add(x);
	    }
	    
	    public int pop() {
	        while(!stack.isEmpty()){
	            dummy.add(stack.pop());
	        }
	        int pop = dummy.pop();
	        while(!dummy.isEmpty()) {
	        	stack.add(dummy.pop());
	        }
	        return pop;
	    }
	    
	    public int peek() {
	        return stack.get(0);
	    }
	    
	    public boolean empty() {
	        return stack.isEmpty();
	    }
	}

}
