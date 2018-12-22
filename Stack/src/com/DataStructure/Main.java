package com.DataStructure;

public class Main {


    public static void main(String[] args) {
        ArrayStack <Integer> stack = new ArrayStack<>();
        for(int i = 0; i<5 ; i ++){
            stack.push(i);
            System.out.println(stack);
        }
        for (int v = 1 ;v < 3; v++) {
            stack.pop();
            System.out.println(stack);
        }
    }

}
