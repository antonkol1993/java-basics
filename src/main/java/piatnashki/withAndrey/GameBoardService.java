package piatnashki.withAndrey;

import java.util.ArrayList;
import java.util.Arrays;
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

    public GameBoard startMove(GameBoard gameBoard, int move) {
        List<Integer> moveBoard = new ArrayList<>(Arrays.asList(gameBoard.getBoard()));
        if (moveBoard.get(move + 1) == 0) {
            moveBoard.set(move,0);
            moveBoard.set(move + 1,move);
        }
        if (moveBoard.get(move - 1) == 0) {
            moveBoard.set(move,0);
            moveBoard.set(move - 1,move);
        }
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            gameBoard.getBoard()[i] = moveBoard.get(i);
        }

        return gameBoard;
    }


    public GameBoard move(GameBoard board, int number) {
        return board;
    }
}
