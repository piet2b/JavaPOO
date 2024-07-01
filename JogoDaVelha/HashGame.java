package JogoDaVelha;

import java.util.Scanner;

public class HashGame {

    private enum State { EMPTY, PLAYER1, PLAYER2 }
    
    private State[][] board;
    private State currentPlayer;

    public HashGame() {
        board = new State[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = State.EMPTY;
            }
        }
        currentPlayer = State.PLAYER1;
    }

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case EMPTY:
                        System.out.print(".");
                        break;
                    case PLAYER1:
                        System.out.print("X");
                        break;
                    case PLAYER2:
                        System.out.print("O");
                        break;
                }
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    public boolean playMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != State.EMPTY) {
            return false;
        }
        board[row][col] = currentPlayer;
        return true;
    }

    public boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true;
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true;
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true;
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true;
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == State.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == State.PLAYER1) ? State.PLAYER2 : State.PLAYER1;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;
        while (!gameWon && !isBoardFull()) {
            displayBoard();
            int row, col;
            do {
                System.out.println("Player " + (currentPlayer == State.PLAYER1 ? "1 (X)" : "2 (O)") + ", enter your move (row [1-3] and column [1-3]): ");
                row = scanner.nextInt() - 1;
                col = scanner.nextInt() - 1;
            } while (!playMove(row, col));
            gameWon = checkWin();
            if (!gameWon) {
                changePlayer();
            }
        }
        displayBoard();
        if (gameWon) {
            System.out.println("Player " + (currentPlayer == State.PLAYER1 ? "1 (X)" : "2 (O)") + " wins!");
        } else {
            System.out.println("The game is a draw!");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        HashGame game = new HashGame();
        game.playGame();
    }
}
