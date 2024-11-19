
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = 0;

        System.out.print("First number? ");
        int firstNum = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());

        int sum = firstNum;

        while (sum <= lastNum) {
            totalSum = sum + totalSum;
            sum++;
        }
        System.out.println("The sum is " + totalSum);
    }
}
