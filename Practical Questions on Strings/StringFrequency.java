import java.util.Scanner;
public class StringFrequency{
    public boolean isSubstring(String str1,String str2){
        int index=str1.indexOf(str2);
        return index>=0;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        StringFrequency obj=new StringFrequency();
        while(true){
        System.out.println("enter the Main String: ");
        String str1=scn.nextLine();

        System.out.println("enter the sub String: ");
        String str2=scn.nextLine();
        if(obj.isSubstring(str1,str2)){
            System.out.println(str2 +" is a substring of "+str1);
        }else{
            System.out.println(str2 +" is not a substring of "+str1);
        }
        }
    }
}