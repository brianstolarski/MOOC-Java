
public class Printer {

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        int index = 0;
        while (index < array.length) {
            for (int stars = 0; stars < array[index]; stars++) {
                System.out.print("*");
            }
            index++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // You can test the method here
        int[] array = { 5, 1, 3, 4, 2 };
        printArrayInStars(array);
    }

}
