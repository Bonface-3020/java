import java.util.Scanner;

public class QuickSort{
    static void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi=partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n = scn.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        quickSort(arr,0,n-1);
        System.out.println("Sorted array is: ");
        printArr(arr);
    }
}