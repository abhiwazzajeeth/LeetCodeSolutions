class Solution {
    public int numIslands(char[][] grid) {
        int numIslands = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] == '1') {
                    numIslands += 1;
                    calcIslands(grid, i ,j);

                }
            }
        }
        return numIslands;
    }
    public void calcIslands(char[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0') return;
        
        grid[i][j] = '0';
        calcIslands(grid, i + 1, j);
        calcIslands(grid, i - 1, j);
        calcIslands(grid, i, j + 1);
        calcIslands(grid, i, j - 1);

    }
}

// The key here is after traversing '1' set it to '0', so that in the next iteration it is not considered, Time -> O(n*n), Space ->O(n*n)
