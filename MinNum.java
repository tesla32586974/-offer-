package algorithm;
import java.util.Arrays;
import java.util.Comparator;



public class MinNum {
	public String PrintMinNumber(int [] numbers) {
		String[] strs = new String[numbers.length];
		for(int i=0; i<numbers.length; i++){
			strs[i] = String.valueOf(numbers[i]);
		}
		Arrays.sort(strs, new Comparator<String>(){
			@Override
			public int compare(String c1, String c2){
				String str1 = c1 + c2;
				String str2 = c2 + c1;
				return str1.compareTo(str2);
			}
		});
		StringBuilder str = new StringBuilder();
		for(String item : strs){
			str.append(item);
		}
		return str.toString();
    }
}
