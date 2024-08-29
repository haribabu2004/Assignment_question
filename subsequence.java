// package recurrsion;

import java.util.ArrayList;
import java.util.List;

public class subsequence {
    static int a[]={3,1,2};
    static int n=a.length;

    public static void subseq(int ind,List<Integer> list){
        if(ind ==n) {
            System.out.println(list);
            return;
        }
        list.add(a[ind]);
        subseq(ind+1, list);
        list.remove(list.size()-1);
        subseq(ind+1, list);
    }

    public static void subsets() {

        int nums[]={1,2,3};

        // int n=nums.length;
        List<List<Integer>> list = new ArrayList<>();
        // int ind=0;
        
        list.add(new ArrayList<>());

        for(int num:nums){
            int size=list.size();
            for(int i=0;i<size;i++){
                List<Integer> temp= new ArrayList<>(list.get(i));
                
                temp.add(num);
                list.add(temp);
            }
        }
        System.out.println(list);
        // return list;
        
        
     }

    public static void main(String[] args) {
        // subseq(0,new ArrayList<>());
        subsets();
    }
}
