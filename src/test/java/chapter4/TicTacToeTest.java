package chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    @Test
    void whenTheGameStartsItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getCurrentPlayer();
        assertEquals("X", expectedValue);
    }

    @Test
    void whenPlayerXMakesAMoveItShouldBePlayerOTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getNextPlayer();
        assertEquals("O", expectedValue);
    }

    @Test
    void whenPlayerOMakesAMoveItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.getNextPlayer();
        String expectedValue = ticTacToe.getNextPlayer();
        assertEquals("X", expectedValue);
    }
    @Test
    void whenPlayerXMakesAMoveOnPosition2ItShouldReplace2(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getCurrentPlayer();
        String[][] board = ticTacToe.createBoard();
        board[0][1] = "X";
        assertEquals(board[0][1], expectedValue);
    }

    @Test
    void whenPlayerOMakesAMoveOnPosition1ItShouldReplace1(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getNextPlayer();
        String[][] board = ticTacToe.createBoard();
        board[0][0] = "O";
        assertEquals(board[0][0], expectedValue);
    }
}
