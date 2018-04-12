package algorithm;

public class RobotMove {
	public int movingCount(int threshold, int rows, int cols)
    {
		 boolean[][] flag = new boolean[rows][cols];
        return moving(threshold, rows, cols, 0, 0, flag);
    }
	public int moving(int threshold, int rows, int cols, int row, int col, boolean[][] flag){
		if(row < 0 || col < 0 || col >= cols || row >= rows)
			return 0;
		if(check(threshold, row, col) == false || flag[row][col] == true)
			return 0;
		flag[row][col] = true;
		return 1 + moving(threshold, rows, cols, row + 1, col, flag) 
				+ moving(threshold, rows, cols, row - 1, col, flag) 
				+ moving(threshold, rows, cols, row, col + 1, flag) 
				+  moving(threshold, rows, cols, row, col - 1, flag);
				
				
	}
	public boolean check(int threshold, int row, int col){
		int sum = 0;
		while(row!=0 || col!=0){
			sum = sum + row%10 + col%10;
			row = row/10;
			col = col/10;
		}
		if(sum > threshold)
			return false;
		else
			return true;
	}
}
