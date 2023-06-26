package listArray;

import java.util.ArrayList;

public class operationsOfList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Add Element


        list.add(1);  //O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);


        //get Element

        int element = list.get(2);   //O(1)
        System.out.println(element);


        //Remove element

        list.remove(1);    //O(n)
        System.out.println(list);


        //Remove and set new element

        list.set(2, 69);    //O(n)
        System.out.println(list);


        //check element or contains value?
        
        System.out.println(list.contains(69));     //O(n)

        //adding a number to a particular index

        list.add(3, 55);
        list.add(1, 34);
        System.out.println(list);


        //Size of Arraylist

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
}
