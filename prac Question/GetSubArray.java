import java.util.Scanner;
public  class GetSubArray{
    public int[] getSubArray(int[] arr, int startIndex, int endIndex){
        int length=endIndex-startIndex;
        int[] result=new int[length];
        for (int i=startIndex; i<endIndex;i++){
            result[i-startIndex]=arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        try(Scanner scn=new Scanner(System.in)){
            GetSubArray obj=new GetSubArray();
            System.out.println("Enter the size of the array:");
            int n=scn.nextInt();

            int[] arr=new int[n];

            System.out.println("Enter the elements of the array:");
            for(int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }

            System.out.println("Enter the start Index of the subarray:");
            int start=scn.nextInt();
            System.out.println("Enter the end Index of the subarray:");
            int end=scn.nextInt();

            int[] subarray=obj.getSubArray(arr, start, end);

            System.out.println("subArray:");
            for(int num:subarray){
                System.out.print(num+" ");
            }
        }
    }
}