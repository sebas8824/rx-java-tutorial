package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher2 {
    public static void main(String[] args) {
        /* Approach using Observable.just to pass up to 10 elements and it uses onNext() implicitly and use onComplete
         * when the items have been pushed*/
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
