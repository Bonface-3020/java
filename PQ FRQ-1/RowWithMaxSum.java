import java.util.Scanner;
public  class RowWithMaxSum{
    public static int[] getRowWithMaxSum(int[][] array2D){
        int[] maxRow= array2D[0];
        int maxSum = 0;

        for (int i =1;i<array2D.length;i++){
            int sum = 0;
            for (int j=0;j<array2D[i].length;j++){
                sum += array2D[i][j];
            }
            if (sum>maxSum){
                maxSum=sum;
                maxRow=array2D[i];
            }
        }
        return maxRow;
    }

    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
            System.out.print("enter number of rows in your array: ");
            int rows = scn.nextInt();
            System.out.print("enter number of columns in your array: ");
            int cols = scn.nextInt();

            int[][] array2D = new int[rows][cols];
            System.out.print("enter elementsof of the array: ");
            for (int i = 0; i<rows;i++){
                for (int j=0;j<cols;j++){
                    array2D[i][j]=scn.nextInt();
                }
            }
            int[] maxRow = getRowWithMaxSum(array2D);
            System.out.println("Row with max sum is: ");
            for (int num: maxRow){
                System.out.print(num+" ");
            }
        }
    }
}