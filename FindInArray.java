package algorithm;

/*
 * 题目
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

/*
 * 思路
 * 从右上角开始搜寻，小于目标值，下移，大于目标值，左移
 */
public class FindInArray {
	
	//target: 要寻找的数字
	//array: 二维数组
	public Boolean Find(int target, int[][] array){
		Boolean found = false;
		int minRow = 0; 
		int maxColumn = array[0].length - 1;
		while(minRow<=array.length - 1 && 0<=maxColumn){
			if(array[0][0]>target || array[array.length - 1][maxColumn]<target){
				//数组最小值大于要目标数字 || 最大值小于目标数字 
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
