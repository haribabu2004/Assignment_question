// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class nse {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 5, 3, 1, 2 };
        int len = arr.length;
        int[] res = new int[len];
        Stack<Integer> stk = new Stack<>();

        for (int i = len - 1; i >= 0; i--) {
            while (!stk.isEmpty() && arr[i] < stk.peek())
                stk.pop();

            if (!stk.isEmpty() && arr[i] > stk.peek())
                res[i] = stk.peek();

            if (stk.isEmpty()) {
                res[i] = -1;
            }
            stk.push(arr[i]);
        }
        // System.out.println();
        System.out.println(Arrays.toString(res));
    }
}
