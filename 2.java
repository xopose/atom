import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        swap(2, 3);
    }

    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + ", " + b);
    }

    public static List<Integer> swapWithReturningValue(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        List<Integer> args = new ArrayList<>();
        args.add(a);
        args.add(b);
        return args;
    }
}
