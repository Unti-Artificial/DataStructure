package com.DataStructure;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Array array = new Array(20);
        for (int i = 0; i < 10; i++)
            array.addLast(i);
        System.out.println(array);
        array.add(1, 50);
        System.out.println(array);
        array.addFirst(20);
        System.out.println(array);
        //[20,0,50,1,2,3,4,5,6,7,8,9]
        array.remove(2);
        System.out.println(array);

        array.removeElement(6);
        System.out.println(array);
    }
}
