package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.add(2,25);// 2 is index number. [10, 20, 25, 30, 40]
        numbers.add(5,45);//5 is index number [10, 20, 25, 30, 40, 45]

        System.out.println(numbers);//[10, 20, 30, 40]

        System.out.println(numbers.size());//6

        int lastIndex = numbers.size()-1;

        System.out.println("lastIndex = " + lastIndex);// 5

        int num = numbers.get(3);

        System.out.println("num = " + num);// 30 (unboxing)

        System.out.println("--------------------------");

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Ruby");

        list.set(3,"Java Script");

        System.out.println(list);//[Java, Python, C++, Java Script]

    }
}
