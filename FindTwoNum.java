package algorithm;
import java.util.ArrayList;
import java.util.HashMap;

public class FindTwoNum {
	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        //排除异常
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(array.length < 2)
			return list;
		//第一步把所有符合的两位数找出来,数字找一个就行了，另外一个是sum-x
		HashMap<Integer,Integer> arrMap = new HashMap<Integer,Integer>();
		//将互补的数存入Map,检查原来数组是否有这个就行了
		for(int i=0; i<array.length; i++){
			arrMap.put(array[i], 1);
		}
		int min = 0, product = 0;
		for(int i=0; i<array.length; i++){
			if(arrMap.get(sum - array[i]) != null){
				if(product == 0){
					min = array[i];
					product = array[i]*(sum - array[i]);
				}
				if(product > array[i]*(sum - array[i])){
					min = array[i];
					product = array[i]*(sum - array[i]);
				}
			}
		}
		
		if(min == 0)
			return list;
		list.add(min);
		list.add(sum-min);
		return list;
    }
}
