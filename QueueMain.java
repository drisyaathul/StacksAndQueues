package com.bridgelabz.StacksAndQueues;

public class QueueMain {
    public static void main(String[] args) {
        System.out.println("*** Welcome to Queue *** ");
        /*
        UC3: create a Queue of 56->30->70
         */
        Queue<Integer> queue = new Queue();
        queue.append(56);
        queue.append(30);
        queue.append(70);
        queue.display();
        System.out.println("---------------------------------------");
        /*
        UC4: Dequeue from the beginning
         */
        queue.display();
        Integer deQueue;
        do {
            deQueue = queue.pop();
            if (deQueue == null)
                System.out.println("Queue is Empty");
            else
                System.out.println("Dequeue the element is "+deQueue);
            queue.display();
        }
        while (deQueue != null);
    }
}
