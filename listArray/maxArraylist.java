package listArray;

import java.util.ArrayList;

public class maxArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(4);
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
    
}
