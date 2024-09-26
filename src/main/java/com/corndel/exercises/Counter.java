package com.corndel.exercises;

public class Counter {
    // Define instance variable
   private int count;


    // Define constructor variable same name as class
        public Counter() {
        this.count = 0;
    }
    // Define a method
    // increment(), which adds one to count
    public void increment(int count) {
        this.count ++;
    }
    // reset(), which sets count to 0
    public void reset(int count) {
        this.count = 0;
    }
    //getCount(), which returns the current count
    public int getCount(int count) {
       return this.count;
    }
}