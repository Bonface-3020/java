import java.util.Scanner;
public class DisplayArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n= scn.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();

        }
        displayArr(arr,0);
    }
    public static void displayArr(int[] arr,int i) {
        if (i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        displayArr(arr, i+1);
}
}