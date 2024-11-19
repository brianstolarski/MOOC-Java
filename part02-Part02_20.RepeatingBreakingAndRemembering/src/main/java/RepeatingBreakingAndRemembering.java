
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        int sumOfNums = 0;
        int numOfNums = 0;
        int evenNum = 0;
        int oddNum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");

        while (true) {

            int userNum = Integer.valueOf(scanner.nextLine());

            if (userNum % 2 == 0) {
                evenNum++;
            } else if (userNum > 0 && userNum % 2 != 0) {
                oddNum++;
            }

            if (userNum >= 0) {
                sumOfNums += userNum;
                numOfNums++;
                continue;
            }

            if (userNum < 0) {
                System.out.println("Thx! Bye!");
                break;
            }
        }

        double averageOfNums = (double) sumOfNums / (double) numOfNums;

        System.out.println("Sum: " + sumOfNums);
        System.out.println("Numbers: " + numOfNums);
        System.out.println("Average: " + averageOfNums);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}
