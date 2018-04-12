package algorithm;

public class FindPath {
	
	public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
		if(matrix.length == 0 || rows*cols != matrix.length || str.length == 0)
			return false;
		boolean[] matVisit = new boolean[matrix.length];
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++){
				if(findPath(i, j, 0, matrix, rows, cols, str, matVisit) == true)
					return true;
			} 
		return false;
    }
	public boolean findPath(int row, int col, int pStr, char[] matrix, int rows, int cols, char[] str, boolean[] matVisit){
		if(pStr >= str.length)
			return true;
		if(row >= rows || col >= cols || row < 0 || col<0)
			return false;
		if(matrix[row*cols + col] != str[pStr] || matVisit[row*cols + col] == true)
			return false;
		matVisit[row*cols + col] = true;
		if(findPath(row + 1, col, pStr + 1, matrix, rows, cols, str, matVisit) == true ||
				findPath(row - 1, col, pStr + 1, matrix, rows, cols, str, matVisit) == true ||
				findPath(row, col + 1, pStr + 1, matrix, rows, cols, str, matVisit) == true ||
				findPath(row, col - 1, pStr + 1, matrix, rows, cols, str, matVisit) == true)
			return true;
		else{
			matVisit[row*cols + col] = false;
			return false;
		}
	}
	
	public static void main(String[] args){
		FindPath a = new FindPath();
		char[] matrix = {'A','B','C','E','S','F','C','S','A','D','E','E'};
		char[] str = {'A','B','C','C','E','D'};
		a.hasPath(matrix, 3, 4, str);
	}
}
