
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int totalSum = 0;

        System.out.print("Last number? ");
        int lastNum = Integer.valueOf(scanner.nextLine());

        while (sum < lastNum) {
            sum++;
            totalSum = sum + totalSum;
        }
        System.out.println("The sum is " + totalSum);
    }
}
