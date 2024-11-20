
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        for (Integer wholeList : numbers) {
            System.out.println(wholeList);
        }

        // or

        // int index = 0;
        // while (index < numbers.size()) {
        // int number = numbers.get(index);
        // System.out.println(number);
        // index++;
    }
}
