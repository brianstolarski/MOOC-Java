
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String word = scan.nextLine();
        System.out.println("Enter the second string:");
        String word2 = scan.nextLine();

        if (word.equals(word2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        // Write your program here. 
    }
}
