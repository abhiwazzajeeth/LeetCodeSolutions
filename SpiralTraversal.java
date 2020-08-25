class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) {
            return list;
        }
        int startRow = 0;
        int endRow = matrix.length - 1;
        
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        
        while(startRow <= endRow && startCol <= endCol) {
            for(int i = startCol; i <= endCol; i++) {
                list.add(matrix[startRow][i]);
            }
            for(int  i = startRow + 1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            for(int i = endCol - 1; i >= startCol; i--) {
                if(endRow != startRow)
                list.add(matrix[endRow][i]);
            }
            for(int i = endRow - 1; i > startRow; i--) {
                if(endCol != startCol)
                list.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    return list;
    }
}
