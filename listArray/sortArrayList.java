package listArray;

import java.util.ArrayList;
import java.util.Collections;
public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(4);
        Collections.sort(list);
        System.out.println(list);   // Ascending Order

        Collections.sort(list, Collections.reverseOrder());   //Descending Order
        System.out.println(list);
    }
    
}
