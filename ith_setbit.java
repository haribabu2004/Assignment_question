import java.util.*;

public class ith_setbit {

    public static int setbit(int n,int i){
        return (n&(1<<i))!=0 ? 1:0 ;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:");
        int num=s.nextInt();
        
        int ans=setbit(num,1);
        System.out.println(ans);
    }
}
