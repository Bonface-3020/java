import java.uti.*;
public class CheckPalindrome{
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String input;

        System.out.println("✨ Welcome to the Palindrome Checker! ✨\n type 'exit' to leave.");
        while (true){
            System.out.println("Enter a word or a phrase to check if its a palindrome");
            input = scn.nextLine();
            if (input.equalsIgnoreCase("exit")){
                System.out.println("✨ goodbye, see you later! ✨");
                break;
            }
            if(isPalindrome(cleanInput(input))){
                System.out.println("✨Congratulations, the word!" +input+" is a palindrome ✨"+RESET);
            }else{
                System.out.println("✨ nice try, the word" +input+ " is not a palindrome! ✨"+ RESET);
            }
        }
        scn.close();
    }
    public static String cleanInput(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while (left<right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}