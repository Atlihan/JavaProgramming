package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
        // multiply each  numbers with 2 in the array
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
// 
        System.out.println(list);//[10, 20, 30, 40]

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i) * 2);
        }
        System.out.println(list);//[20, 40, 60, 80]

        System.out.println("-------------------------------------");

        ArrayList<String> employees  = new ArrayList<>();

        employees.add("Juan");
        employees.add("Ali");
        employees.add("Jane");
        employees.add("Tom");

        System.out.println(employees);//[Juan, Ali, Jane, Tom]

        employees.remove(0);
        System.out.println(employees);//[Ali, Jane, Tom]

        employees.remove(0);
        System.out.println(employees);//[Jane, Tom]

        employees.remove(employees.size()-1);// removing the last index
        System.out.println(employees);//[Jane]

        employees.remove("Jane");
        System.out.println(employees);//[]





    }

}
