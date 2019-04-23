package com.rxjava.chapter2;

import io.reactivex.Observable;

import java.util.concurrent.Future;

public class Launcher10 {
    public static void main(String[] args) {
        /* RxJava can turn futures into Observables as well.
        Future<String> futureValue = ...;
        Observable.fromFuture(futureValue)
                .map(String::length)
                .subscribe(System.out::println);
        */
    }
}

