package piatnashki.withAndrey;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameBoardService gameBoardService = new GameBoardService();
        GameBoard gameBoard = gameBoardService.newGame(4);
        System.out.println(gameBoard);
//        gameBoardService.move(gameBoard,5);
//        System.out.println(gameBoard);


            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the number" );
            int numb = scanner.nextInt();
            GameBoard newBoard = gameBoardService.startMove(gameBoard, numb);
            System.out.println(gameBoard);



    }
}
