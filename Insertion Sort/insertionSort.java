import java.util.Scanner;

public class InsertionSort {
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) { // Fixed Syntax
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array: "); // Fixed Semicolon
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: "); // Fixed Semicolon
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close(); // Closing scanner

        InsertionSort obj = new InsertionSort();
        obj.sort(arr);

        System.out.println("Sorted array: "); // Fixed Semicolon
        printArray(arr);
    }
}