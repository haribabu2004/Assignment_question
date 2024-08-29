import java.util.*;

public class setbit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int cnt=0;

        while(num>0){
            num=num&(num-1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
