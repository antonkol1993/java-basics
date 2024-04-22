package piatnashki.withAndrey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameBoardService gameBoardService = new GameBoardService();
        GameBoard gameBoard = gameBoardService.newGame(4);
//        GameBoard gameBoard = gameBoardService.newGameNotRandom(4);
        System.out.println(gameBoard);


        for (; ; ) {
            if (gameBoardService.win(gameBoard)) {
                System.out.println("You win!!!!");
                return;
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number");
            int numb;
            if (scanner.hasNextInt()) {
                numb = scanner.nextInt();
                if (numb < 1 || numb >= gameBoard.getArrayLength()) {
                    System.out.println("Sorry, enter the correct number. Your number has out of bound ");
                } else {
                    gameBoard = gameBoardService.move(gameBoard, numb);
                    System.out.println(gameBoard);
                }
            } else {
                System.out.println("Sorry, enter the correct number (only numbers from 1 to " + (gameBoard.getArrayLength() - 1) + ")");
            }

            try {
                if (scanner.hasNextInt()) {
                    numb = scanner.nextInt();
                    boolean b = numb <= -100000 || numb > 321323;
                };
            } catch (NumberFormatException e) {
                System.out.println("This is a very long number");
            } catch (Exception e) {
                System.out.println("It's a not number type");
            }



//                int numb = scanner.nextInt();

//                if (numb < 1 || numb > 15 ) {
//                    System.out.println("Please enter the correct number (from 1 to 15 )");
//                }


        }


    }


}
