import java.util.Scanner;

class BubbleSort{
    static void bubblesort(int arr[],int n){
        int i,j,temp;
        boolean swapped;

        for (i=0;i<n-1;i++){
            swapped=false;
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
    static void printArray(int arr[],int size){
        for (int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[] number=(3,2,6,4,2,7,1,8);
        bubblesort(number);
        System.out.println("sorted array is:");
        printArray(arr,n);
    }
}