package sudoku;

public class sudokuSolver {
    public static void main(String[] args) {
        
        sudokuBoard sudokuBoard = new sudokuBoard();
        solveSudoku(sudokuBoard.sudokuBoard);
        sudokuBoard.displaySudokuBoard();
    
    }

    public static void solveSudoku(char[][] board) {
        helper(board);
    }

    private static boolean helper(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    continue;  // Skip to the next cell if the current one is not empty
                }

                for (char k = '1'; k <= '9'; k++) {
                    if (isValid(board, i, j, k)) {
                        board[i][j] = k;
                        if (helper(board)) {
                            return true;
                        }
                        board[i][j] = '.';  // Backtrack if the placement doesn't lead to a solution
                    }
                }
                return false;  // No valid digit found for the current cell
            }
        }

        return true;  // All cells are filled == the puzzle is solved
    }

    private static boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) {
                return false;
            }

            if (board[row][i] != '.' && board[row][i] == c) {
                return false;
            }

            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
                    &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) {
                return false;
            }
        }
        return true;
    }


}
