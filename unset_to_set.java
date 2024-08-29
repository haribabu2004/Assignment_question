import java.util.Scanner;

public class unset_to_set {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int num=s.nextInt();
        
        num=num|(1<<1);
        System.out.println(num);
    }
}
