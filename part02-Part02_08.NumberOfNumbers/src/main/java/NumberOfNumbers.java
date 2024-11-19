import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {

        int inputs = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0 || num < 0) {
                inputs++;
            } else {
                System.out.println("Number of numbers: " + inputs);
                break;

            }
        }
    }
}
