package Leetcode;
import java.util.*;
public class Delete_greatest_value_in_each_row_2500 {
    public static void main(String[] args) {
        int[][] grid={{1,2,4},{3,3,1}};
        Delete_greatest_value_in_each_row_2500 ob=new Delete_greatest_value_in_each_row_2500();
        System.out.println(ob.deleteGreatestValue(grid));
    }
    public int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        int[] sum=new int[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                q.add(grid[i][j]);
            }
            int k=0;
            while(k<grid[i].length)
            {
                int t=q.poll();
                sum[k]=Math.max(sum[k],t);
                k++;
            }
        }
        int ans=0;
        for(int i=0;i<sum.length;i++)
        {
            ans=ans+sum[i];
        }
        return ans;
    }
}
