package com.rxjava.chapter2;

import io.reactivex.Observable;

import java.util.concurrent.TimeUnit;

public class Launcher9 {
    public static void main(String[] args) {
        /* .interval() will emit infinitely at the specified interval, unless we use a function that operates on a timer */
        Observable.interval(1, TimeUnit.SECONDS)
            .subscribe(s -> System.out.println(s + " Bogotá"));
        sleep(5000);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
