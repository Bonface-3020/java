import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<String> employee= new ArrayList<>();

        employee.add("John Doe");
        employee.add("Alice Wanda");
        employee.add("Grace Chui");
        employee.add("Salman Mohan");

        System.out.println("first employee is: "+ employee.get(0));
        System.out.println("third employee is: "+ employee.get(2));

        employee.set(0,"bob lee");
        employee.remove(3);

        System.out.println("\nAll Employees: ");
        for(String emp: employee){
            System.out.println(emp);
        }

    }
}