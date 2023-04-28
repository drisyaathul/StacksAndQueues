package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Stack *** ");
        /*
        UC1: create a Stack of 56->30->70
         */
        Stack<Integer> stack = new Stack<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display();
    }
}
