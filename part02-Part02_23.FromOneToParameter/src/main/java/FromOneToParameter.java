

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number) {

        int num = 0;

        while (num < number) {
            num++;
            System.out.println(num);
        }
    }

}
