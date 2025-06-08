import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        while (true){
        System.out.print("Enter a fun message (or type 'exit' to stop): ");
        String message = scn.nextLine();
        if (message.equalsIgnoreCase("exit")){
            System.out.print("THANK YOU, have a great day!!");
            break;
        }
        String ReversedMessage=new StringBuilder(message).reverse().toString();
        String funnyMessage = message + " <---> " + ReversedMessage;
        System.out.println("Reversed message: " + ReversedMessage);
        System.out.println("Funny combined message: " + funnyMessage);

        }
        scn.close();
    }
}