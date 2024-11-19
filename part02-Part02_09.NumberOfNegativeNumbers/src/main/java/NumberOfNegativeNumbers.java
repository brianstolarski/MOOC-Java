import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {

        int negativeNumbers = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num < 0) {
                negativeNumbers++;
            } else if (num > 0) {
                continue;
            } else {
                System.out.println("Number of negative numbers: " + negativeNumbers);
                break;
            }
        }
    }
}
