package algorithm;

public class Frog {
	public int JumpFloor(int target) {
		if(target == 0)
			return 1;
		if(target == 1)
			return 1;
		if(target == 2)
			return 2;
		int k=0;
		for(int i=1; i<=target; i++)
			 k += JumpFloor(target-i);
		return k;
    }
	
	public static void main(String[] args){
		Frog a = new Frog(); 
		System.out.println(a.JumpFloor(3));
	}
}
