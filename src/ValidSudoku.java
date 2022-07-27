import java.util.ArrayList;
import java.util.List;

public class ValidSudoku {

    public static void main(String[] args) {
        char[] a = {'a', 'b'};

        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                        , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                        , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                        , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                        , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                        , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                        , {'.', '6', '.', '.', '.', '.', '5', '8', '.'}
                        , {'.', '.', '.', '4', '1', '9', '.', '.', '.'}
                        , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println(isValidSudoku(board));
        System.out.println(board[8][7]);
    }

    public static boolean isValidSudoku(char[][] board) {

        List<Character> temp = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            temp.clear();
            for (int j = 0; j < 9; j++) {
                if (temp.contains(board[i][j]) && board[i][j] != '.')
                    return false;
                else
                    temp.add(board[i][j]);
            }
        }

        for (int j = 0; j < 9; j++) {
            temp.clear();
            for (int i = 0; i < 9; i++) {
                if (temp.contains(board[i][j]) && board[i][j] != '.')
                    return false;
                else
                    temp.add(board[i][j]);
            }
        }

        for (int l = 0; l < 7; l = l+3){
//            temp.clear();
            for (int k = 0; k < 7; k = k + 3) {
                temp.clear();
                for (int i = k; i < k+3; i++) {
                    for (int j = l; j < l+3; j++) {
                        if (temp.contains(board[i][j]) && board[i][j] != '.')
                            return false;
                        else
                            temp.add(board[i][j]);
                    }


                }

            }
        }


        return true;

    }
}
