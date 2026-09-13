package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] int_array = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < int_array.length; i++) {
            System.out.println(int_array[i]);
        }
        ArrayList<Integer> dyn_list = new ArrayList<>();;
        dyn_list.add(1);
        dyn_list.add(2);
        dyn_list.add(7);
        dyn_list.add(42);
        dyn_list.add(67);

        for(int i : dyn_list) {
            System.out.println(i);
        }
        for (Integer integer : dyn_list) {
            System.out.println(integer);
        }
    }

}
