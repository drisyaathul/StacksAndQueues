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
        System.out.println("---------------------------------------");
        /*
        UC2: Peek and Pop from the stack till it is Empty
         */
        stack.display();
        stack.peek();
        stack.display();
        System.out.println("---------------------------------------");
        stack.display();
        Integer poppedData;
        do {
            poppedData = stack.pop();
            if (poppedData == null)
                System.out.println("Stack is Empty");
            else
                System.out.println("Popped element is " + poppedData);
            stack.display();
        }
        while (poppedData != null);
        System.out.println("---------------------------------------");
    }
}

