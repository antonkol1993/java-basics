package piatnashki.withAndrey;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        GameBoardService gameBoardService = new GameBoardService();
//        GameBoard gameBoard = gameBoardService.newGame(4);
        GameBoard gameBoard = gameBoardService.newGameNotRandom(4);
        System.out.println(gameBoard);
//        gameBoardService.move(gameBoard,5);
//        System.out.println(gameBoard);



            for (;;) {
                if (gameBoardService.win(gameBoard)) {
                    System.out.println("You win!!!!");
                    return;
                }
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter the number");

//                String next = scanner.next();
//
//                try {
//                    int i = Integer.parseInt(next);
//                } catch (NumberFormatException e) {
//                    System.out.println("try again");
//                }

                int numb = scanner.nextInt();

//                if (numb < 1 || numb > 15 ) {
//                    System.out.println("Please enter the correct number (from 1 to 15 )");
//                }

                gameBoard = gameBoardService.move(gameBoard, numb);
                System.out.println(gameBoard);




            }


    }


}
