import java.util.Scanner;
public class SumOfElements {
    public static int sumArray(int [] arr,int index ){
        if (index<0){
            return 0;
        }
        return arr[index]+sumArray(arr, -1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i<n;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("Sum of elements of array is "+sumArray(arr,n-1));
        scanner.close();
    }
}