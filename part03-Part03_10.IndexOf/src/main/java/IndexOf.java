
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        int item = list.get(0);
        for (Integer number : list) {
            if (item != number) {
                item++;
            }
            if (item == number) {
                System.out.println(number + "is at index" + item);
            }
        }   

        System.out.println("");

        // implement here finding the indices of a number
    }
}
