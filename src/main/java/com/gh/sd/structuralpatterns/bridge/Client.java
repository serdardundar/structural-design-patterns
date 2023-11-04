package com.gh.sd.structuralpatterns.bridge;

public class Client {

    public static void main(String[] args) {
        FifoCollection<Integer> collection = new Queue<>(new SinglyLinkedList<>());
        collection.offer(10);
        collection.offer(40);
        collection.offer(99);

        System.out.println(collection.poll());
        System.out.println(collection.poll());
        System.out.println(collection.poll());
        //
        System.out.println(collection.poll());

        System.out.println("****************************************************************");

        FifoCollection<Integer> collection2 = new Queue<>(new ArrayLinkedList<>());
        collection2.offer(30);
        collection2.offer(60);
        collection2.offer(100);

        System.out.println(collection2.poll());
        System.out.println(collection2.poll());
        System.out.println(collection2.poll());
        //
        System.out.println(collection2.poll());
    }

}

