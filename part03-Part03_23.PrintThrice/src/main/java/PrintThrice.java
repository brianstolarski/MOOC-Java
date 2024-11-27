
import java.util.Scanner;

public class PrintThrice {

    // public static String Word() {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Give a word: ");
    //     String thing = scanner.nextLine();
    //     return thing;
    // }

    // public static void main(String[] args) {
    //     String thing = Word();
    //     System.out.println(thing + thing + thing);

    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word: ");
        String thing = scanner.nextLine();

        System.out.println(thing + thing + thing);
    }
}

