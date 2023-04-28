package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList;

public class Stack<T> {
    //creates Linked list Object
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        /*
          Pushing the nodes into Stack using Linked list
         */
        linkedList.push(data);
    }
    public void display() {
        /*
          Display the LinkedList
         */
        linkedList.display();
    }
}
