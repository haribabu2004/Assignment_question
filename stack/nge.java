import java.util.*;

public class nge {
    public static void main(String[] args) {
        int[] arr={4,12,5,3,1,2,5,3,1,2,4,6};
        Stack<Integer> stk = new Stack<>();
        
        int n=arr.length;
        int[] res=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!stk.isEmpty()){
                if(stk.peek()>arr[i]) {
                    res[i]=stk.peek();
                    stk.push(arr[i]);
                    break;
                }
                else stk.pop();
            }
            if(stk.isEmpty()) {
                res[i]=-1;
                stk.add(arr[i]);
            }
        }
        // System.out.println();C:\Users\sys\Desktop\REcurssurRE
        System.out.println(Arrays.toString(res));
    }
}
