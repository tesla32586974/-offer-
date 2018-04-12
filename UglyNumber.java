package algorithm;
import java.util.LinkedList;
import java.util.List;

public class UglyNumber {
	 public int GetUglyNumber_Solution(int index) {
		if(index == 0)
			return 0;
		 int t2=0, t3=0, t5=0;
		 int [] arr = new int[index];
		 arr[0] = 1;
		 for(int i=1; i<index; i++){
			 arr[i] = min(arr[t2]*2, arr[t3]*3, arr[t5]*5);
			 if(arr[i] == arr[t2]*2) t2++;
			 if(arr[i] == arr[t3]*3) t3++;
			 if(arr[i] == arr[t5]*5) t5++;
		 }
		 return arr[index - 1];
	   }
	 
	 public int min(int a, int b, int c){
		 int min = a<b ? a : b;
		 return min<c ? min : c;
	 }
	 
	 public static void main(String[] args){
		 UglyNumber a = new UglyNumber();
		 a.GetUglyNumber_Solution(6);
	 }
}
