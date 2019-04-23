package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher15 {
    public static void main(String[] args) {
        /* Creates an observable from a given exception, so it can be handled in the onError method */
        Observable.fromCallable(() -> 1 /0)
                .subscribe(i -> System.out.println("Received: " + i),
                        e -> System.out.println("Error captured: " + e));
    }
}
