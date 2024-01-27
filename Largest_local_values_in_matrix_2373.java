package Leetcode;
import java.util.*;
import java.util.Arrays;

public class Largest_local_values_in_matrix_2373 {
    public static void main(String[] args) {
        int[][] grid={{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        System.out.println(Arrays.deepToString(largestLocal(grid)));
    }
    public static int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] box=new int[n-2][n-2];
        for(int r=0;r<n-2;r++)
        {
            for(int c=0;c<n-2;c++)
            {
                box[r][c]=maxValue(grid,r,c);
            }
        }
        return box;
    }
    public static int maxValue(int[][] grid, int i, int j)
    {
        int max=0;
        for(int row=i;row<i+3;row++)
        {
            for(int column=j;column<j+3;column++)
            {
                max=Math.max(grid[row][column], max);
            }
        }
        return max;
    }
}
