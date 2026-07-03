class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rows = new HashSet<>();
            Set<Character> columns = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (rows.contains(board[i][j])) {
                        return false;
                    }
                    rows.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    if (columns.contains(board[j][i])) {
                        return false;
                    }
                    columns.add(board[j][i]);
                }
            }
        }
        for (int s = 0; s < 9; s++) {
            Set<Character> squares = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = (s / 3) * 3 + i;
                    int c = (s % 3) * 3 + j;
                    if (board[r][c] != '.') {
                        if (squares.contains(board[r][c])) {
                            return false;
                        }
                        squares.add(board[r][c]);
                    }
                }
            }
        }
        return true;
    }
}
