import java.util.*;

public class power_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int cnt=0;

        while(num>0){
            num=num&(num-1);
            cnt++;
        }

        if(cnt==1){
            System.out.println("power of 2");
        }else{
            System.out.println("Not power of 2");
        }
    }
}
