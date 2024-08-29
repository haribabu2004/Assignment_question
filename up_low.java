import java.util.*;

public class up_low {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter char:");
        char ch = s.next().charAt(0);

        if ((ch & 1 << 5) > 0) {
            ch = (char) (ch & ~(1 << 5));
            System.out.println(ch);
        } else {
            ch = (char) (ch | 1 << 5);
            System.out.println(ch);
        }

    }
}
