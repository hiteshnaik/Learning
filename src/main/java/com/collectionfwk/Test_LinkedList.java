package com.collectionfwk;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Test1 ");
        list1.add("Test2");
        list1.add("Test3");

        System.out.println("Through Iterator Way");
        for(Iterator i = list1.iterator() ; i.hasNext();){
            System.out.println(i.next());
        }

        System.out.println("Through Traditional Way");
        for(int i = 0 ; i<list1.size() ; i++){
            System.out.println(list1.get(i));
        }

        System.out.println("Through Advanced For loop");
        for (String check : list1){
            System.out.println(check);
        }


    }




}
