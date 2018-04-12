package algorithm;
import java.util.ArrayList;

public class StackOrder {
	public boolean IsPopOrder(int [] pushA,int [] popA) {
	      int pushi = 0,popj = 0;
	      while(pushi<pushA.length){
	    	  int i=pushi;
	    	  while(popj < popA.length && pushA[pushi] == popA[popj]){//判定栈顶
	    		  pushA[pushi] = -1;
	    		  while(pushi > 0 && pushA[--pushi] == -1);
		    	  popj++;
	    	  }
	    	  pushi = i+1;//push
		   } 
	      for(int i=0; i<pushA.length; i++){
	    	  if(pushA[i]!=-1)
	    		  return false;
	      }
	      return true;
    }
	
	public static void main(String[] args){
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,2,5,3,1};
		StackOrder a= new StackOrder();
		a.IsPopOrder(pushA, popA);
	}
}