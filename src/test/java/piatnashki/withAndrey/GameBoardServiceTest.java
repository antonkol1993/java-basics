package piatnashki.withAndrey;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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

        GameBoard gameBoard = new GameBoard(size);

        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            gameBoard.getBoard()[i] = i;
        }

        assertArrayEquals( arr,gameBoard.getBoard());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "2", "3", "4",
            "5", "8", "9", "10"
    })
    void newGame(int count) {

        GameBoard gameBoard = new GameBoard(count);

        Integer [] testBoard = new Integer[count * count];

        List<Integer> allValues = new ArrayList<>();

        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            allValues.add(i,i);
            testBoard[i] = allValues.get(i);
        }
        for (int i = 0; i < gameBoard.getArrayLength(); i++) {
            int index = new Random().nextInt(gameBoard.getArrayLength());
            gameBoard.getBoard()[i] = allValues.get(index);
            allValues.remove(index);
        }
        int sumTestBoard = 0;
        int sumGameBoard = 0;
        for (int i = 0; i < count * count; i++) {
            sumGameBoard += gameBoard.getBoard()[i];
            sumTestBoard += testBoard[i];
        }
//            assertNotEquals(testBoard,gameBoard);
            assertEquals(sumTestBoard,sumGameBoard);


    }

    @Test
    void move() {

    }


}