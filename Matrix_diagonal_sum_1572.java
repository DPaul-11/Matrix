package Leetcode;
import java.util.*;
public class Matrix_diagonal_sum_1572 {
    public static void main(String[] args) {
       int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
       Matrix_diagonal_sum_1572 ob=new Matrix_diagonal_sum_1572();
       System.out.println(ob.diagonalSum(mat));
    }
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum+=mat[i][j];
                    mat[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i+j)==n-1)
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
}
