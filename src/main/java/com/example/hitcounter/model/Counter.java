package com.example.hitcounter.model;

public class Counter {
    private int count;

    public Counter() {
    }

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int increment() {
        return count++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + count +
                 increment() +
                '}';
    }
}
