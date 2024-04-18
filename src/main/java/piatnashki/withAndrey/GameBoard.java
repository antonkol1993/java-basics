package piatnashki.withAndrey;

import java.util.Arrays;
import java.util.Objects;

public class GameBoard {

    private Integer[] board;
    private final Integer size;

    public GameBoard(Integer size) {
        this.size = size;
        board = new Integer[size * size];
    }


    public Integer[] getBoard() {
        return board;
    }


    public Integer getArrayLength() {
        return board.length;
    }


    public Integer getSize() {
        return size;
    }

    public void setBoard(Integer[] board) {
        this.board = board;
    }



    @Override
    public int hashCode() {
        int result = Arrays.hashCode(board);
        result = 31 * result + size.hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                String val = board[i * size + j] == 0 ? "[]" : board[i * size + j].toString();
                builder.append(String.format("%3s", val));
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GameBoard gameBoard = (GameBoard) object;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(board, gameBoard.board)) return false;
        return size.equals(gameBoard.size);
    }
}
