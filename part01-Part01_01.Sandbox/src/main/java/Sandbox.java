
public class Sandbox {

    public static void main(String[] args) {

        int temp = 25;
        int hum = 25;

        if (temp >= 25) {
            if (temp > 25 && hum <= 25) {
                System.out.println("Hot");
            } else {
                System.out.println("Too Hot");
            }
        } else {
            System.out.println("Warm");
        }
    }
}
