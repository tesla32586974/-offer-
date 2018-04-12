package algorithm;

public class RectCover {

	public int RectCover(int target) {
		 if(target < 1)
				return 0;
		if(target == 1)
			return 1;
		if(target == 2)
			return 2;
		return RectCover(target-1)+RectCover(target-2);
    }
	public static void main(String[] args) {
		RectCover a = new RectCover();
		System.out.println(a.RectCover(4));

	}

}
