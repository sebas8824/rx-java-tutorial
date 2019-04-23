package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher13 {
    public static void main(String[] args) {
        /* Observable.error() is used more likely for testing, it will throw an error with an specified exception */
        Observable.error(() -> new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("Received: " + i), Throwable::printStackTrace, () -> System.out.println("Done!"));
    }
}
