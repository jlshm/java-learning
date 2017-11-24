import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] a = new String[100];
        a = Arrays.copyOf(a,2*a.length);
        System.out.println(a.length);

        System.out.println("Hello World!");

    }
}
