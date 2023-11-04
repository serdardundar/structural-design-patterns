package com.gh.sd.structuralpatterns.bridge;

/**
 * A refined abstraction
 *
 * @param <T>
 */
//A refined abstraction.
public class Queue<T> implements FifoCollection<T> {

    private final LinkedList<T> list;

    public Queue(LinkedList<T> list) {
        this.list = list;
    }

    @Override
    public void offer(T element) {
        list.addLast(element);
    }

    @Override
    public T poll() {
        return list.removeFirst();
    }
}
