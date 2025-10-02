package Projects;

import java.util.Scanner;

public class Tic_Tac_Toe {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String[][] board = new String[3][3];
            
            // Fill the board with spaces at the start of the game
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = " ";
                }
            }
            
            String currentPlayer = "X";
            boolean gameover = false;
            
            System.out.println("Let's play Tic-Tac-Toe!");
            System.out.println("Player 1 will be 'X' and Player 2 will be 'O'.");
            
            // The main game loop continues until the game is over
            while (!gameover) {
                
                // First, we display the current board so the player can see it
                printBoard(board);
                
                // Now, we ask the current player for their move
                System.out.println("Player " + currentPlayer + ", enter your move.");
                System.out.print("Enter row (0, 1, or 2): ");
                int row = scan.nextInt();
                
                System.out.print("Enter column (0, 1, or 2): ");
                int col = scan.nextInt();
                scan.nextLine(); // Consume the leftover newline from the previous input
                
                // Check if the move is valid
                // This checks if the chosen spot is within the board and is not already taken
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col].equals(" ")) {
                    board[row][col] = currentPlayer; // Place the player's mark on the board
                    
                    // Now, check if the game is over
                    if (checkForWin(board, currentPlayer)) {
                        printBoard(board);
                        System.out.println("Player " + currentPlayer + " wins! 🎉");
                        gameover = true;
                    } else if (isBoardFull(board)) {
                        printBoard(board);
                        System.out.println("The game is a draw! It's a tie. 🤝");
                        gameover = true;
                    } else {
                        // Switch to the next player's turn
                        if (currentPlayer.equals("X")) {
                            currentPlayer = "O";
                        } else {
                            currentPlayer = "X";
                        }
                    }
                } else {
                    System.out.println("This is not a valid move. Please try again.");
                }
            }
        }
    }
    
    // This method prints the current state of the board
    public static void printBoard(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
    
    public static boolean checkForWin(String[][] board, String player) {
    // Check all rows, columns, and both diagonals for a win
    for (int i = 0; i < 3; i++) {
        // Check rows
        if (board[i][0].equals(player) && board[i][1].equals(player) && board[i][2].equals(player)) {
            return true;
        }
        // Check columns
        if (board[0][i].equals(player) && board[1][i].equals(player) && board[2][i].equals(player)) {
            return true;
        }
    }
    // Check main diagonal (top-left to bottom-right) and anti-diagonal
    if ((board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
        (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))) {
        return true;
    }
    return false;
}
    
    // This method checks if the board is full, which means the game is a draw
    public static boolean isBoardFull(String[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" ")) {
                    return false; // Found an empty spot, so the board is not full
                }
            }
        }
        return true; // No empty spots were found
    }
}