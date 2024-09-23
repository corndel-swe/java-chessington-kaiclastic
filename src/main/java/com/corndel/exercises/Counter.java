package com.corndel.exercises;

public class Counter {
    // Define instance variable
    int count ;
    // Define constructor variable
        public Counter() {
        this.count = 0;

    }
    // Define a method
    // increment(), which adds one to count
    public void increment() {
        this.count ++;
    }

    public void reset() {
        this.count = 0;
    }
    public int getCount() {
       return this.count;
    }
}