package listArray;
import java.util.*;

public class pairSum {

    // public static boolean findPairSum(ArrayList<Integer> list, int target) {
    //     for (int i = 0; i < list.size(); i++) {
    //         for(int j=i+1; j<list.size(); j++) {
    //             if(list.get(i) + list.get(j) == target) {
                    // return true;                                     (Brute Force)
    //             }
    //         }
            
    //     }
    //     return false;
    // }

    public static boolean findSum(ArrayList<Integer> list, int target) {
        int n = list.size();
        int LP = 0, RP = n-1;
        while(LP <RP){
            //Case 1
            if(list.get(LP) + list.get(RP)  == target) {
                return true;
            }
            //Case 2
            if(list.get(LP) + list.get(RP)  < target) {
                LP++;
            } else{
                RP--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(7);
        int target =13;
        System.out.println(findSum(list, target));

    }
    
}

