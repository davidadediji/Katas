package chapter4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

    @Test
    void whenTheGameStartsItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getValue("X");
        assertEquals("X", expectedValue);
    }

    @Test
    void whenPlayerXMakesAMoveItShouldBePlayerOTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getValue("O");
        assertEquals("O", expectedValue);
    }

    @Test
    void whenPlayerOMakesAMoveItShouldBePlayerXTurn(){
        TicTacToe ticTacToe = new TicTacToe();
        String expectedValue = ticTacToe.getValue("O");
        assertEquals("O", expectedValue);
    }


}
