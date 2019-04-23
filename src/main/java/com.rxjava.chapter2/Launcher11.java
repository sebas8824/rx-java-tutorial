package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher11 {
    public static void main(String[] args) {
        /* Example using Observable.empty(), it just calls onComplete(), this is used for testing more likely */
        Observable<String> empty = Observable.empty();
        empty.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Done!"));
    }
}
