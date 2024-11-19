
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        double totalSum = 0;
        int userInputs = 0;
        double averageValue = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());    

            if (num > 0 || num < 0) {
                totalSum = num + totalSum;
                userInputs++;
            }

            if (num == 0) {
                break;
            }
        }
        averageValue = totalSum / userInputs;
        System.out.println("Average of the numbers: " + averageValue);

    }
}
