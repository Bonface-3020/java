import  java.util.Scanner;
public  class IsSorted{
    public boolean IsSorted(int[] arr){
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try(Scanner scn=new Scanner(System.in)){
            System.out.println("Enter number of elements in the array:  ");
            int n=scn.nextInt();
            int[] arr=new int[n];
            System.out.println("Enter elements of the array: ");
            for (int i=0;i<n;i++){
                arr[i]=scn.nextInt();
            }
            IsSorted obj=new IsSorted();
            boolean result=obj.IsSorted(arr);
            if (result){
                System.out.println("the array is sorted");
            }else{
                System.out.println("the array is not sorted");
            }
        }
    }
}