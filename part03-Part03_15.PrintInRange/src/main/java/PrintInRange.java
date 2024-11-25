
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer values : numbers) {
            if (values >= lowerLimit && values <= upperLimit) {
                System.out.println(values);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(2);
        list.add(6);
        list.add(-1);
        list.add(5);
        list.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(list, 0, 5);
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(list, 3, 10);
    }

}
