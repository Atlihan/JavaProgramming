package day49_Collection;

import java.util.*;

public class SetInterfacePractice {

    public static void main(String[] args) {


       List<Integer> list  = new ArrayList<>();
        list.addAll(Arrays.asList(10,200,300,40, 90));
        list.addAll(Arrays.asList(10,200,300,40, 90));
        list.addAll(Arrays.asList(10,200,300,40, 90));
        list.addAll(Arrays.asList(10,200,300,40, 90));
        list.addAll(Arrays.asList(10,200,300,40, 90));

        System.out.println("list = " + list);
        //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]
        //List accepts DUPLICATES


        Set<Integer> hashSet = new HashSet<>();

        hashSet.addAll(Arrays.asList(10,200,300,40, 90));
        hashSet.addAll(Arrays.asList(10,200,300,40, 90));
        hashSet.addAll(Arrays.asList(10,200,300,40, 90));
        hashSet.addAll(Arrays.asList(10,200,300,40, 90));
        hashSet.addAll(Arrays.asList(10,200,300,40, 90));

        System.out.println("hashSet = " + hashSet);//hashSet = [200, 40, 10, 90, 300]
        //hashset does not accept DUPLICATES


        Set<Integer>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10,200,300,40, 90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40, 90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40, 90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40, 90));
        linkedHashSet.addAll(Arrays.asList(10,200,300,40, 90));




        Set<Integer> treeSet = new TreeSet<>();
     treeSet.addAll(Arrays.asList(10,200,300,40, 90));
     treeSet.addAll(Arrays.asList(10,200,300,40, 90));
     treeSet.addAll(Arrays.asList(10,200,300,40, 90));
     treeSet.addAll(Arrays.asList(10,200,300,40, 90));
     treeSet.addAll(Arrays.asList(10,200,300,40, 90));

     System.out.println("treeSet = " + treeSet);//treeSet = [10, 40, 90, 200, 300]
    }
}
