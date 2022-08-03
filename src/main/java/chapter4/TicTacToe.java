package chapter4;

import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    String currentPlayer = "X";
    List<String> test = new ArrayList<>();
    public String getCurrentPlayer() {
        test.add(currentPlayer);
        return test.get(0);
    }
    public String getNextPlayer() {
        while (test.size() < 2){
            getCurrentPlayer();
            String player = String.valueOf(test);
            String nextPlayer;
            switch (player){
                case "O":
                    nextPlayer = "X";
                    test.remove(0);
                    test.add(nextPlayer);
                    break;
                default:
                    nextPlayer = "O";
                    test.remove(0);
                    test.add(nextPlayer);
            }
            return test.get(0);
        }
        return test.get(0);
    }
    public static String[][] createBoard() {
        String[][] intArray = {{"1", "2", "3"},{"4", "5", "6"}, {"7", "8", "9"}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }
        return intArray;
    }
    public void move(int position){
        String player = getCurrentPlayer();
        String[][] board = createBoard();
        switch (position){
            case(1):
                board[0][0] = player;
                break;
            case(2):
                board[0][1] = player;
                break;
            case(3):
                board[0][2] = player;
                break;
            case(4):
                board[1][0] = player;
                break;
            case(5):
                board[1][1] = player;
                break;
            case(6):
                board[1][2] = player;
                break;
            case(7):
                board[2][0] = player;
                break;
            case(8):
                board[2][1] = player;
                break;
            default:
                board[3][2] = player;
        }
        System.out.println(board);
    }
    public static void main(String[] args) {
        createBoard();
//        move(2);
    }
}
