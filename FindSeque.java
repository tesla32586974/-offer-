package algorithm;
import java.util.ArrayList;

public class FindSeque {
	 public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> allList = new ArrayList<ArrayList<Integer>>();
		 
		 int max = (sum+1)/2;
		 int start=1, end=2;
		 int count = start + end;
		 while(start < max && start < end){
			 if(count == sum){
				 //记录序列
				 ArrayList<Integer> list = new ArrayList<Integer>();
				 for(int i=start; i<=end; i++){
					 list.add(i);
				 }
				 allList.add(list);
				 end++;
				 count = count + end;
			 }
			 else if(count < sum){
				 end++;
				 count = count + end;
			 }
			 else if(count > sum){
				 start++;
				 count = count - (start - 1);
			 }
		 }
		 return allList;
	 }
	 
	 public static void main(String [] args){
		 FindSeque a = new FindSeque();
		 a.FindContinuousSequence(9);
	 }
}
