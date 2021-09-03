package September;

public class _200 {
    int rows, cols;

    public int numIslands(char[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    DFSMarking(grid, i, j);
                }
            }
        }

        return count;
    }

    public void DFSMarking(char[][] grid, int i, int j) {
        if (!isValid(i, j)) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        DFSMarking(grid, i + 1, j);
        DFSMarking(grid, i - 1, j);
        DFSMarking(grid, i, j + 1);
        DFSMarking(grid, i, j - 1 );
    }

    private boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < cols && j < cols;
    }
}
