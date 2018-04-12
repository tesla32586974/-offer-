package algorithm;
import java.util.Arrays;


public class JudgeContinue {
	public boolean isContinuous(int [] numbers) {
		Arrays.sort(numbers);
		int count0 = 0;
		int diffSum = 0;
		for(int i=0; i<numbers.length - 1; i++){
			if(numbers[i] == 0)
				count0++;
			else
				diffSum = diffSum + numbers[i + 1]- numbers[i];
		}
		if(count0 == 4)
			return true;
		if( diffSum<=4 && diffSum>=(4-count0)){
			return true;
		}
		return false;
    }
}
