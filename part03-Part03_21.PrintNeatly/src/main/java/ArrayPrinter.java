
public class ArrayPrinter {

    public static void printNeatly(int[] array) {
        int index = 0;
        while (index < array.length) {
            if (index == array.length - 1) {
                System.out.print(array[index]);
            } else {
                System.out.print(array[index] + ", ");
            }
            index++;
        }

    }

    public static void main(String[] args) {
        // You can test your method here
        int[] array = { 5, 1, 3, 4, 2 };
        printNeatly(array);
    }

}
