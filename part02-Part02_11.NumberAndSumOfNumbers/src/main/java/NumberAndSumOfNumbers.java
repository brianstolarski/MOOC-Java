import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;
        int userInputs = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0 || num < 0) {
                userInputs++;
                sum = num + sum;
            } else if (num == 0) {
                break;
            }

        }
        System.out.println("Number of numbers: " + userInputs);
        System.out.println("Sum of the numbers: " + sum);
    }
}
