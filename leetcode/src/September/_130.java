package September;

public class _130 {
    int rows, cols;
    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        if (rows < 3 || cols < 3) return;

        //col 0 & col n - 1;
        for (int m = 0; m < rows; m++) {
            if (board[m][0] == 'O') {
                DFS(board, m, 0);
            }
            if (board[m][cols - 1] == 'O') {
                DFS(board, m, cols - 1);
            }
        }

        //row 0 & row -1;
        for (int n = 0; n < cols; n ++) {
            if (board[0][n] == 'O') {
                DFS(board, 0, n);
            }
            if (board[rows - 1][n] == 'O') {
                DFS(board, rows - 1, n);
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                else if (board[i][j] == '*') board[i][j] = 'O';
            }
        }

    }

    private void DFS(char[][] board, int i, int j) {
        if (!isValid(i, j)) return;
        if (board[i][j] == 'X') return;
        board[i][j] = '*';
        DFS(board, i + 1, j);
        DFS(board, i - 1, j);
        DFS(board, i, j + 1);
        DFS(board, i, j - 1);

    }

    private boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < rows && j < cols;
    }


}
