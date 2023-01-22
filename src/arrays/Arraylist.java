package arrays;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.remove(3));
        System.out.println(list);
        list.set(4, 10);
        System.out.println(list);
        System.out.println(list.size());
    }
}
