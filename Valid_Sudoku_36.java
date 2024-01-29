package Leetcode;
import java.util.*;
public class Valid_Sudoku_36 {
    public static void main(String[] args) {
        char[][] board={ {'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        Valid_Sudoku_36 ob=new Valid_Sudoku_36();
        System.out.println(ob.isValidSudoku(board));
    }
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current=board[i][j];
                if(current!='.')
                {
                    if((!seen.add(current+"found in row"+i))||(!seen.add(current+"found in column"+j))||(!seen.add(current+"found in sub-box"+i/3+"-"+j/3)))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
