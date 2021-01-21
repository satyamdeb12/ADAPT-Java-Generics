package Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericClientTest {
    public static void main(String[] args) {
        /*
          Create object
          Create List
          Add to the list
          Call Setter with the list
          Cal Getter with forEach
         */
        //Created an object of MyGenericClass
        MyGenericClass1<Integer> myGenericClass1 = new MyGenericClass1<>();

        //Created a list of Integer
        List<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(101);
        list1.add(102);

        //Setter for MyGenericClass
        myGenericClass1.setList(list1);
        //Getter for MyGenericClass
        myGenericClass1.getList().forEach(System.out::println);
        System.out.println("-------------------------------");
        //----------------------------------------------------------------


        /*
          Create object
          Create List
          Add to the list
          Call Setter with the list
          Cal Getter with forEach
         */
        MyGenericClass1<String> myGenericClass12 = new MyGenericClass1<>();
        List<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Hello");
        list2.add("World");

        myGenericClass12.setList(list2);
        myGenericClass12.getList().forEach(System.out::println);
        System.out.println("-------------------------------");
        //-----------------------------------------------------------------


        MyGenericClass2<Integer, String> myGenericClass21 = new MyGenericClass2<>(1001, "Hello");
        System.out.println(myGenericClass21.getKey()+" : \t"+myGenericClass21.getValue());


        MyGenericClass2<String, String> myGenericClass22 = new MyGenericClass2<>("Name", "Killer3o3");
        System.out.println(myGenericClass22.getKey()+" : \t"+myGenericClass22.getValue());

    }
}
