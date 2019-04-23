package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher6 {
    public static void main(String[] args) {
        /* Cold Observable example: Works like a music CD */
        Observable<String> source =
                Observable.just("Alpha","Beta","Gamma","Delta","Epsilon");

        /* Both observers will execute in the order these were subscribed and generate the emissions for
        * each observer.*/
        source.subscribe(s -> System.out.println("Observer 1 Received: " + s));
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(s -> System.out.println("Observer 2 Received: " + s));
    }
}
