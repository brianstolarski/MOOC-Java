
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);
        


        // write your program here

    }
}
