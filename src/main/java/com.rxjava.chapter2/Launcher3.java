package com.rxjava.chapter2;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

public class Launcher3 {
    public static void main(String[] args) {
        /* Approach using Observable.fromIterable to pass up an iterable object, uses onNext() for each element and
         * invoke onComplete() when it finishes the iterations*/
        List<String> items = Arrays.asList("Alpha", "Beta", "Gamma", "Delta", "Epsilon");
        Observable<String> source = Observable.fromIterable(items);
        source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}
