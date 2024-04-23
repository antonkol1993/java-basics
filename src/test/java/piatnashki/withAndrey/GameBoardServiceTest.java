package piatnashki.withAndrey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameBoardServiceTest {


    @ParameterizedTest
    @CsvSource(value = {
            "2", "3", "4",
            "5", "8", "10"
    })
    void win(int value) {
        GameBoard gameBoard1 = new GameBoard(value);

        for (int i = 0; i < gameBoard1.getArrayLength(); i++) {
            gameBoard1.getBoard()[i] = i;
        }


        GameBoardService gameBoardService = new GameBoardService();
        GameBoard gameBoard = gameBoardService.newGameNotRandom(value);



        Assertions.assertEquals(gameBoard1,gameBoard);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "2", "3", "4",
            "5", "8", "10"
    })
    void newGameNotRandom(int size) {
        Integer [] arr = new Integer[size*size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        GameBoardService gameBoardService = new GameBoardService();
        GameBoard gameBoard = new GameBoard(size);

        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            gameBoard.getBoard()[i] = i;
        }

        assertArrayEquals( arr,gameBoard.getBoard());
    }

    @Test
    void newGame() {
    }

    @Test
    void move() {
    }
}