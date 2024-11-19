
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secNum = Integer.valueOf(scanner.nextLine());

        int total = firstNum + secNum;

        System.out.println("The sum of the numbers is " + total);

    

        // Write your program here

    }
}
