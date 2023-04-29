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
    public void peek() {
        /*
         * Peek returns the top item but does not remove it.
         * First Element is popped and pushed to the same linkedList.
         */
        Integer peekedData = (Integer) linkedList.pop();
        System.out.println("Peek Element is "+peekedData);
        linkedList.push((T)peekedData);
    }
    public T pop() {
        /*
           pop to delete the first element
         */
        return linkedList.pop();
    }
}
