package algorithm;
import java.util.Stack;

public class StackImpl {
	int point = -1;
	int[] stack = new int[10];
	
	public void push(int node) {
		stack[++point] = node;
    }
    
    public void pop() {
    	if(point == -1)
    		return;
    	stack[point--] = -1;
    }
    
    public int top() {
        if(point == -1)
        	return -1;
    	return stack[point];
    }
    
    public int min() {
    	if(point == -1)
    		return -1;
    	int pt = point;
    	int min = stack[pt];
    	while(pt != -1){
    		if(min > stack[pt])
    			min = stack[pt];
    		pt--;
    	}
    	return min;  
    }
    
    public static void main(String[] args){
    	StackImpl a = new StackImpl();
    	a.push(1);
    	a.pop();
    	System.out.print(a.top());
    }
}
