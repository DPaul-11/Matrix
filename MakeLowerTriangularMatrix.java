
import java.util.Scanner;

public class MakeLowerTriangularMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of lines: ");
        int n=sc.nextInt();
        int[][] arr=new int[n][n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter values of row "+(i+1)+" : ");
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>i)
                {
                    arr[i][j]=0;
                }
            }
        }

        System.out.println("The lower triangular matrix is : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
