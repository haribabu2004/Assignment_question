import java.util.Scanner;

public class set_to_unset {

    public static int setbit(int n,int i){
        // System.out.println(i+"th place bit is "+(1&(1<<i)));
        return n&(~(1<<i));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int num=s.nextInt();
        
        int ans=setbit(num,2);
        System.out.println("changed to "+ans);
    }
}
