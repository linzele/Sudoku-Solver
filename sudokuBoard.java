public class sudokuBoard {

    // Change the board to your liking / the game
    // This is just a template i made myself up
    char[][] sudokuBoard = {
            {'.', '.', '.', '.', '7', '.', '1', '.', '.'},
            {'4', '.', '5', '.', '.', '.', '.', '.', '.'},
            {'9', '.', '7', '.', '.', '.', '.', '.', '.'},
            {'.', '7', '.', '.', '2', '.', '3', '8', '5'},
            {'.', '.', '8', '.', '.', '.', '.', '9', '1'},
            {'.', '.', '.', '.', '.', '.', '.', '4', '6'},
            {'.', '3', '.', '.', '.', '.', '8', '.', '.'},
            {'6', '.', '.', '5', '.', '.', '.', '.', '.'},
            {'.', '.', '.', '9', '.', '.', '.', '.', '.'}
    };

    public static void main(String[] args) {
        sudokuBoard sudokuBoardTest = new sudokuBoard();
        sudokuBoardTest.displaySudokuBoard();
    }

    public void displaySudokuBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudokuBoard[i][j] + " ");
                if ((j + 1) % 3 == 0 && j != 8) {
                    System.out.print("| "); // Add vertical separators between 3x3 subgrids
            // Amend the design to your liking
                }
            }
            System.out.println();

            if ((i + 1) % 3 == 0 && i != 8) {
                System.out.println("---------------------"); // Add horizontal separators between 3x3 subgrids
                // Amend the design to your liking
            }
        }
    }
}
