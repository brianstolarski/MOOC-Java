
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a string:");
        String valueOne = scan.nextLine();
        System.out.println("Give an integer:");
        int valueTwo = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valueThree = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valueFour = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + valueOne);
        System.out.println("You gave the integer " + valueTwo);
        System.out.println("You gave the double " + valueThree);
        System.out.println("You gave the boolean " + valueFour);


        

        // Write your program here

    }
}
