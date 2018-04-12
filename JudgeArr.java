package algorithm;

public class JudgeArr {
	public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
        	return false;
        }
        else if(sequence.length < 3)
        	return true;
        else{
        	int root = sequence[sequence.length-1];
        	int i=0;
        	for(i=0; i<sequence.length-1 && sequence[i]<root; i++);//找到分界点
        	for(int j=i; j<sequence.length-1; j++){//右子树大于根
        		if(sequence[j] <= root)
        			return false;
        	}
        	int[] left = new int[i],right = new int[sequence.length-1 - i];
        	for(int k=0; k<i; k++){
        		left[k] = sequence[k];
        	}
        	for(int k=0; k<sequence.length-1-i; k++){
        		right[k] = sequence[k+i];
        	}
        	if(left.length == 0)
        		return VerifySquenceOfBST(right);
        	else if(right.length == 0)
        		return VerifySquenceOfBST(left);
        	else
        		return VerifySquenceOfBST(left) && VerifySquenceOfBST(right);
        } 
    }
	public static void main(String[] args){
		int[] arr = {7,4,6,5};
		JudgeArr a = new JudgeArr();
		System.out.println(a.VerifySquenceOfBST(arr));
	}
}
