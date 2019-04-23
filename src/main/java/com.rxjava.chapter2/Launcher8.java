package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher8 {
    public static void main(String[] args) {
        /* This example uses .range() to determine a range of integers that will pass through the events
         * range between: start and count */
        Observable.range(5,10)
            .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
