import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter two number:");
        int num=s.nextInt();
        int num1=s.nextInt();


        num=num^num1;
        num1=num^num1;
        num=num^num1;

        System.out.println(num +" "+ num1);
    }
}
