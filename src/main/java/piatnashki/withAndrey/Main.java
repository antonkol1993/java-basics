package piatnashki.withAndrey;

public class Main {
    public static void main(String[] args) {
        GameBoardService gameBoardService = new GameBoardService();
        GameBoard gameBoard = gameBoardService.newGame(4);
        System.out.println(gameBoard);
        gameBoardService.move(gameBoard,5);
        System.out.println(gameBoard);
//        while (true) {
//            //scanner
//
//            GameBoard newBoard = gameBoardService.move(gameBoard, 15);
//            System.out.println(newBoard);
//        }


    }
}
