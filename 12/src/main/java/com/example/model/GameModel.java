
package com.example.model;

public class GameModel {
    private String[][] board;
    private boolean playerTurn;

    public GameModel() {
        board = new String[3][3];
        playerTurn = true;
    }

    public String[][] getBoard() {
        return board;
    }

    public boolean isPlayerTurn() {
        return playerTurn;
    }

    public void switchTurn() {
        playerTurn = !playerTurn;
    }

    public boolean placeMove(int row, int col, String symbol) {
        if (board[row][col] == null) {
            board[row][col] = symbol;
            return true;
        }
        return false;
    }

    public boolean checkWin(String symbol) {
        for (int i = 0; i < 3; i++) {
            if (symbol.equals(board[i][0]) && symbol.equals(board[i][1]) && symbol.equals(board[i][2])) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (symbol.equals(board[0][j]) && symbol.equals(board[1][j]) && symbol.equals(board[2][j])) {
                return true;
            }
        }
        if (symbol.equals(board[0][0]) && symbol.equals(board[1][1]) && symbol.equals(board[2][2])) {
            return true;
        }
        if (symbol.equals(board[0][2]) && symbol.equals(board[1][1]) && symbol.equals(board[2][0])) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
}