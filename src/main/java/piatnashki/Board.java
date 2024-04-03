package piatnashki;

import java.util.Random;
import java.util.Scanner;

public class Board {


    private Integer[][] board;
    private Integer length;

    public Board(Integer length) {
        this.board = new Integer[length][length];
        this.length = length;
    }

    public Integer[][] newGame() {

        // todo create array ( 0 - 15 )
        int k = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = k + 1;
                k++;
                if (board[i][j] == length * length) {
                    board[i][j] = null;
                }


            }
        }


        Random random = new Random();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; i < board.length; i++, j++) {
                random = new Random();

                int index = random.nextInt(i, board.length);
                Integer temp = board[i][j];
                board[i][j] = board[index][i];
                board[index][i] = temp;
            }
        }
        // todo shuffle numbers in array
        int i = random.nextInt(0, board.length);
        int j = random.nextInt(0, board.length);
        Integer temp = board[i][j];
        board[i][j] = board[board.length - 1][board.length - 1];
        board[board.length - 1][board.length - 1] = temp;


//        // todo out in console
//        System.out.println();
//        for (
//                Integer[] ints : board) {
//            for (j = 0; j < board.length; j++) {
//                System.out.print(ints[j] + " ");
//            }
//            System.out.println();
//        }

        return board;
    }

    public void outInConsole() {
        int i = 0;
        while (i < board.length) {
            int j = 0;
            while (j < board[i].length) {
                System.out.printf("%6d",board[i][j]);
                j++;
            }
            System.out.println();
            i++;
        }
    }

//    public Integer[][] moveTitles () {
//
//        Scanner scanner = new Scanner(System.in);
////        outInConsole(newGame());
////        for (;;) {
////
////            System.out.println();
////        }
////        board[][]
//        return newGame();
//    }

    public Integer[][] getBoard() {
        return board;
    }

}