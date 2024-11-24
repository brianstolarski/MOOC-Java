
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        double average = 0;
        double size = list.size();
        for (Double number : list) {
            average = average + number;
        }

        double total = average / size;
        System.out.println("Average: " + total);


        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
