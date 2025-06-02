import java.util.Scanner;
public class SelectionSort{
    void sort (int arr[]) {
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index])
                    min_index=j;
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
    }
    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        System.out.println();
        }
    }

  public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.print("enter the number of elements in the array: ");
    int n=scn.nextInt();
    int arr[]=new int[n];
    System.out.print("enter the elements of the array: ");
    for(int i=0;i<n;i++){
        arr[i]=scn.nextInt();
    }

    SelectionSort ob=new SelectionSort();
    ob.sort(arr);
    System.out.print("the sorted array is: ");
    ob.printArray(arr);
    scn.close();
}
}