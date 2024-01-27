package Leetcode;
import java.util.*;
public class Flipping_an_image_832 {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        int[][] result=new int[n][m];
        for(int i=0;i<n;i++)
        {
            flip(image[i]);
            invert(image[i]);
            result[i]=image[i];
        }
        return result;
    }
    public static void flip(int[] image)
    {
        int n=image.length;
        int i=0;
        int j=n-1;
        while(i<j)
        {
            int temp=image[i];
            image[i]=image[j];
            image[j]=temp;
            i++;
            j--;
        }
    }
    public static void invert(int[] image)
    {
        int n=image.length;
        for(int i=0;i<n;i++)
        {
            if(image[i]==0)
            {
                image[i]=1;
            }else{
                image[i]=0;
            }
        }
    }
}
