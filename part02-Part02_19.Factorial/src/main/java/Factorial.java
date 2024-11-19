
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int totalSum = 1;
        int sum = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());

        while (sum < num) {
            sum++;
            totalSum = totalSum * sum;
        }
        System.out.println("Factorial: " + totalSum);
    }
}
