import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positiveNum = 0;
        int negativeNum = 0;
        int totalNum = 0;

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positiveNum = num + positiveNum;
                continue;
            }

            if (num < 0) {
                negativeNum = num + negativeNum;
                continue;
            }
        }
        totalNum = negativeNum + positiveNum;
        System.out.println("Sum of the numbers: " + totalNum);
    }
}