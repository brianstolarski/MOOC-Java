
import java.util.ArrayList;

public class RemoveLast {

    public static void removeLast(ArrayList<String> strings) {
        if (strings.size() == 0) {
            return;
        }
        if (strings.size() > 0) {
            int lastIndex = strings.size() - 1;
            strings.remove(lastIndex);
        }

    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Brian");
        names.add("George");
        names.add("Jerry");
        names.add("Todd");

        removeLast(names);

        System.out.println(names);
    }

}
