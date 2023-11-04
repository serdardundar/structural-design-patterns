package com.gh.sd.structuralpatterns.bridge;

/**
 * This is the abstraction
 * It represents a Firs in First Out collection
 * @param <T>
 */
public interface FifoCollection<T> {

    // Adds element to the collection
    void offer(T item);

    // Removes & returns first item from collection
    T poll();
}
