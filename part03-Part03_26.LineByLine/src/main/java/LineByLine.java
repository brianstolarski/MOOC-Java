
// import java.util.Scanner;

// public class LineByLine {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.print("");
//             String text = scanner.nextLine();
//             String[] piecesOfText = text.split(" ");

//             if (text.equals("")) {
//                 break;
//             }

//             for (int i = 0; i < piecesOfText.length; i++) {
//                 System.out.println(piecesOfText[i]);
//             }
//         }

//     }
// }


 
import java.util.Scanner;
 
public class LineByLine {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            String[] parts = input.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        }
 
    }
}
 