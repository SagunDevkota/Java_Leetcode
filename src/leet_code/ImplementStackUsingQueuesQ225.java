package leet_code;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueuesQ225 {

	public static void main(String[] args) {
		MyStack mystack = new MyStack();
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		System.out.println(mystack.pop());
		System.out.println(mystack.top());
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
		System.out.println(mystack.empty());
	}
	static class MyStack {
	    Queue<Integer> queue;
	    public MyStack() {
	    	queue = new LinkedList<>();
	    }
	    
	    public void push(int x) {
	        queue.add(x);
	    }
	    
	    public int pop() {
	    	int last = queue.poll();
	    	Queue<Integer> queue2 = new LinkedList<>();
	    	while(!queue.isEmpty()) {
	    		queue2.add(last);
	    		last = queue.poll();
	    	}
	    	while(!queue2.isEmpty()) {
	    		queue.add(queue2.poll());
	    	}
	        return last;
	    }
	    
	    public int top() {
	    	int length = queue.toArray().length-1;
	    	return (int) queue.toArray()[length];
	    }
	    
	    public boolean empty() {
	        return queue.isEmpty();
	    }
	}
}
