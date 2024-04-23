package piatnashki.withAndrey;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameBoardService {

    public boolean win(GameBoard gameBoard) {
        GameBoard finalGameBoard = getFinalGameBoard(gameBoard.getSize());
        return finalGameBoard.equals(gameBoard);
    }

    private GameBoard getFinalGameBoard(int size) {
        GameBoard gameBoard = new GameBoard(size);
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            gameBoard.getBoard()[i] = i;
        }
        return gameBoard;
    }

    public GameBoard newGameNotRandom(int n) {
        GameBoard gameBoard = new GameBoard(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            allValues.add(i,i);
        }
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            gameBoard.getBoard()[i] = allValues.get(i);
        }
        return gameBoard;
    }


    public GameBoard newGame(int n) {
        GameBoard gameBoard = new GameBoard(n);
        List<Integer> allValues = new ArrayList<>();
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            allValues.add(i,i);
        }


        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            int index = new Random().nextInt(allValues.size());
            gameBoard.getBoard()[i] = allValues.get(index);
            allValues.remove(index);
        }
        return gameBoard;
    }

    public GameBoard move (GameBoard gameBoard, int numb) {
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            if (gameBoard.getBoard()[i] == numb) {

                    if (i % gameBoard.getSize() != gameBoard.getSize() - 1 && i + 1 < gameBoard.getArrayLength() && gameBoard.getBoard()[i + 1] == 0) {

                        gameBoard.getBoard()[i] = 0;
                        gameBoard.getBoard()[i + 1] = numb;
                        return gameBoard;
                    } else if (i % gameBoard.getSize() != 0 && gameBoard.getBoard()[i - 1] == 0) {

                        gameBoard.getBoard()[i] = 0;
                        gameBoard.getBoard()[i - 1] = numb;
                        return gameBoard;

                } else if (i - gameBoard.getSize() >= 0 && gameBoard.getBoard()[i - gameBoard.getSize()] == 0) {
                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i - gameBoard.getSize()] = numb;
                    return gameBoard;
                } else if (i + gameBoard.getSize() < gameBoard.getArrayLength() && gameBoard.getBoard()[i + gameBoard.getSize()] == 0) {
                    gameBoard.getBoard()[i] = 0;
                    gameBoard.getBoard()[i + gameBoard.getSize()] = numb;
                    return gameBoard;
                }
            }

        }


        return gameBoard;
    }



    //    public GameBoard move(GameBoard board, int number) {
//        return board;
//    }
}
