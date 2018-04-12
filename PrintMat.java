package algorithm;
import java.util.ArrayList;
public class PrintMat {
	
	public ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> printList = new ArrayList<Integer>();
		int endRow = matrix.length-1;
		int endColumn = matrix[0].length-1;
		int startRow = 0, startColumn = 0;
		while(startRow<=endRow && startColumn<=endColumn){
			for(int i=startRow, j=startColumn; j<=endColumn && startRow<=endRow && startColumn<=endColumn; j++)
				printList.add(matrix[i][j]);
			startRow++;
			for(int i=startRow, j=endColumn; i<=endRow && startRow<=endRow && startColumn<=endColumn; i++)
				printList.add(matrix[i][j]);
			endColumn--;
			for(int i=endRow, j=endColumn; j>=startColumn && startRow<=endRow && startColumn<=endColumn; j--)
				printList.add(matrix[i][j]);
			endRow--;
			for(int i=endRow, j=startColumn; i>=startRow && startRow<=endRow && startColumn<=endColumn; i--)
				printList.add(matrix[i][j]);
			startColumn++;
		}
		return printList;
    }
}
