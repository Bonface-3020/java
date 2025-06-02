import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();

        int[][] Arr = new int[n][n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arr[i][j] = sc.nextInt();
            }
        }

        rotateArray(Arr, n);

        System.out.println("Array after 90 degrees rotation is: ");
        displayArray(Arr, n);

        sc.close();
    }

    public static void rotateArray(int[][] Arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  
                int temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp;
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = Arr[i][j];
                Arr[i][j] = Arr[i][n - j - 1];
                Arr[i][n - j - 1] = temp;
            }
        }
    }

    public static void displayArray(int[][] Arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}