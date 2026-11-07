package leetcode;
//Number of Islands.
class Number {
    public int numIslands(char[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
        if (grid[i][j] == '1' && !visited[i][j]) {
        dfs(grid, visited, i, j);
        ans++;
    }
    }
    }

        return ans;
    }
    public void dfs(char[][] grid, boolean[][] visited, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return;
        }
        if (grid[i][j] == '0' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(grid, visited, i + 1, j);
        dfs(grid, visited, i - 1, j); 
        dfs(grid, visited, i, j + 1); 
        dfs(grid, visited, i, j - 1); 
    }
}