
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int num = Integer.valueOf(scanner.nextLine());

        while (true) {
            if (sum < num) {
                printText();
                sum++;

            }

            if (sum == num) {
                break;
            }

        }
    }

    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }

}
