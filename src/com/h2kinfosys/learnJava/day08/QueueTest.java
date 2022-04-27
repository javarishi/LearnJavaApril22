package com.h2kinfosys.learnJava.day08;

import java.util.Deque;
import java.util.PriorityQueue;
import java.util.concurrent.BlockingDeque;

public class QueueTest {



    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        PriorityQueue<String> emptyQueue = new PriorityQueue<>();

        priorityQueue.offer("Ash");
        priorityQueue.offer("David");
        System.out.println(priorityQueue);
        // Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty
        String head = priorityQueue.peek();
        System.out.println(head);
        System.out.println(priorityQueue);
        head = emptyQueue.peek();
        // Retrieves and removes the head of this queue, or returns null if this queue is empty.
        head = priorityQueue.poll();
        System.out.println(head);
        System.out.println(priorityQueue);
       // Similar to peek. This method differs from peek only in that it throws an exception if this queue is empty.
        head = priorityQueue.element();
       // head = emptyQueue.element();
    }
}
