package piatnashki.withAndrey;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoardService {

    public GameBoardService() {
    }


    public GameBoard newGame(int n) {
        GameBoard gameBoard = new GameBoard(n);
        List<Integer> allValues = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0));

        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            int index = new Random().nextInt(allValues.size());
            gameBoard.getBoard()[i] = allValues.get(index);
            allValues.remove(index);
        }
        return gameBoard;
    }

    public GameBoard startMove(GameBoard gameBoard, int numb) {

        for (int i = 0; i < gameBoard.getLength(); i++) {
            if (gameBoard.getBoard()[i] == numb && gameBoard.getBoard()[i + 1] == 0 && i + 1 < gameBoard.getLength()) {
                gameBoard.getBoard()[i] = 0;
                gameBoard.getBoard()[i + 1] = numb;
                return gameBoard;
            } else if (gameBoard.getBoard()[i] == numb && gameBoard.getBoard()[i - 1] == 0) {
                gameBoard.getBoard()[i] = 0;
                gameBoard.getBoard()[i - 1] = numb;
                return gameBoard;
            } else if (gameBoard.getBoard()[i] == numb && gameBoard.getBoard()[i - 4] == 0) {
                gameBoard.getBoard()[i] = 0;
                gameBoard.getBoard()[i - 4] = numb;
                return gameBoard;
            } else if (gameBoard.getBoard()[i] == numb && gameBoard.getBoard()[i + 4] == 0) {
                gameBoard.getBoard()[i] = 0;
                gameBoard.getBoard()[i + 4] = numb;
                return gameBoard;
            }


        }


        return gameBoard;
    }


    public GameBoard move(GameBoard board, int number) {
        return board;
    }
}
