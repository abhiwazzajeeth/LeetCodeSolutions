class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0;
        int endRow = n - 1;
        
        int startCol = 0;
        int endCol = n - 1;
        
        int number = 1;
        
        while(number <= Math.pow(n, 2)) {
             for(int i = startCol; i <= endCol; i++) {
                matrix[startRow][i] = number;
                number = number + 1;
            }
            for(int  i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = number;
                number = number + 1;
            }
            for(int i = endCol - 1; i >= startCol; i--) {
                if(endRow != startRow) {
                    matrix[endRow][i] = number;
                    number = number + 1;
                }
            }
            for(int i = endRow - 1; i > startRow; i--) {
                if(endCol != startCol) {
                    matrix[i][startCol] = number;
                    number = number + 1;
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return matrix;
    }
}
