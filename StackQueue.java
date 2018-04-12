package algorithm;
import java.util.Stack;

public class StackQueue {
	 Stack<Integer> stack1 = new Stack<Integer>();
	    Stack<Integer> stack2 = new Stack<Integer>();
	    
	    public void push(int node) {
	    	while(!stack2.empty())
	    		stack1.add(stack2.pop());
	    	stack1.add(node);
	    }
	    
	    public int pop() {
	    	while(!stack1.empty())
	    		stack2.add(stack1.pop());
	    	return stack2.pop();
	    }
	    public static void main(String[] args){
	    	StackQueue a = new StackQueue();
	    	for(int i=0; i<10; i++)
	    		a.push(i);
	    	for(int i=0; i<10; i++)
	    		System.out.println(a.pop());
	    	
	    }
}
