package piatnashki.withAndrey;

import java.util.Arrays;
import java.util.Objects;

public class GameBoard {

    private Integer[] board;
    private final Integer length;

    public GameBoard(Integer length) {
        this.length = length;
        board = new Integer[length * length];
    }


    public Integer[] getBoard() {
        return board;
    }

    public Integer getLength() {
        return length;
    }

    public void setBoard(Integer[] board) {
        this.board = board;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        GameBoard gameBoard = (GameBoard) object;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(board, gameBoard.board)) return false;
        return Objects.equals(length, gameBoard.length);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                String val = board[i * length + j] == 0 ? "[]" : board[i * length + j].toString();
                builder.append(String.format("%3s", val));
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    sadasdasasd

}
