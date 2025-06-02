import java.util.Scanner;

public class RepresentArray{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n=scn.nextInt();

        System.out.println("Enter the number of Columns: ");
        int m=scn.nextInt();

        int [][] arr=new int[n][m];
        System.out.println("Enter the elements of the 2D array: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        System.out.println("The entered 2D Array is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}