package com.bridgelabz.StacksAndQueues;

import com.bridgelabz.LinkedList;

public class Queue <T>{

    LinkedList<T> linkedList = new LinkedList<>();

    public T pop() {
        /*
           Dequeue is deleting the first element
         */
        return linkedList.pop();
    }


    public void append(T data) {
        /*
        Adding the nodes into Queue using Linked list
         */
        linkedList.append(data);
    }

    public void display() {
        /*
        Display the Queue in LinkedList
         */
        linkedList.display();
    }

}
