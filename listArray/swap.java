package listArray;
import java.util.ArrayList;

public class swap {
    public static void swapping(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1 , list.get(indx2));
        list.set(indx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int indx1 =1,  indx2 =3;
        swapping(list, indx1, indx2);
        System.out.println(list + " ");
        

    }
    
}
