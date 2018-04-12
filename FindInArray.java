package algorithm;
/*
 * 寻找二维数组内是否包含某一个数字
 */
public class FindInArray {

	public Boolean Find(int target, int[][] array){
		Boolean found = false;
		int minRow = 0; 
		int maxColumn = array[0].length - 1;
		while(minRow<=array.length - 1 && 0<=maxColumn){
			if(array[0][0]>target || array[array.length - 1][maxColumn]<target){
				break;
			} 
			if(array[minRow][maxColumn] == target ){
				found = true;
				break;
			}else if(array[minRow][maxColumn] > target){
				maxColumn--;
			}else{
				minRow++;
			}
		}
		return found;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] testArr = {{1,2,3,4,6},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
		System.out.println(new FindInArray().Find(12,testArr));
	}

}
