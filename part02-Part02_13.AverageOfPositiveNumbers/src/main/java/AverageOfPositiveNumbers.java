
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {

        double positiveNum = 0;
        double userInputs = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num > 0) {
                positiveNum = num + positiveNum;
                userInputs++;
            } else if (num == 0) {
                break;
            }

        }
        if (userInputs > 0) {
            double averageNum = positiveNum / userInputs;
            System.out.println(averageNum);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
