
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int num = Integer.valueOf(scanner.nextLine());
        
        System.out.print("From where? ");
        int num2 = Integer.valueOf(scanner.nextLine());

        for (int i = num2; i <= num; i++) {
            System.out.println(i);
        }
    }
}

