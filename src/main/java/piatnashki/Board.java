package piatnashki;

import java.util.Random;

public class Board {


    private Integer[][] board;
    private Integer length;

    public Board(Integer length) {
        this.board = new Integer[length][length];
        this.length = length;
    }

    public Integer[][] board() {
        Random random = new Random();

        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = k + 1;
                k++;
                if (board[i][j] == length*length) {
                    board[i][j] = null;
                }
            }
        }

        for (Integer[] ints : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        return board;
    }

}
