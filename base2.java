import java.util.*;

public class base2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter value and base1:");
        int n=s.nextInt();
        int base1=s.nextInt();
        System.out.println("Enter convert base2 value:");
        int ans=0,i=0;
        int base2=s.nextInt();
        
        while(n>0){
            int rem=n%10;
            ans+=(int)Math.pow(base1, i)*rem;
            n/=10;
            i++;
        }
        if(base2==10)
        System.out.println(ans);

        else{
            String ans1=Integer.toBinaryString(ans);
            System.out.println(ans1);
        }
    }
}
