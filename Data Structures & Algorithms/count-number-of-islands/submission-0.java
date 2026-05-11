class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int island = 0;
        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(grid[i][j] == '1' && visited[i][j] == false) {
                    dfs(i,j,visited,grid,m,n);
                    island++;
                }
            }
        }
        return island;
    }

    public void dfs(int i, int j, boolean[][] visited, char[][] grid, int m, int n) {
        if(i<0 || j<0 || i>=m || j>=n || visited[i][j] == true || grid[i][j] != '1') {
            return;
        }
        visited[i][j] = true;

        dfs(i, j+1, visited, grid, m, n);
        dfs(i, j-1, visited, grid, m, n);
        dfs(i-1, j, visited, grid, m, n);
        dfs(i+1, j, visited, grid, m, n);
    }
}
