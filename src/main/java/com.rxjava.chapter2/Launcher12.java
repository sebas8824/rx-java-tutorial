package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher12 {
    public static void main(String[] args) {
        /* This one is similar to Observable.empty() but it does not call onComplete()
        * it leaves the observers waiting forever for emissions but never gives any */
        Observable<String> empty = Observable.never();
        empty.subscribe(System.out::println, Throwable::printStackTrace, () -> System.out.println("Done!"));
        // After 5 seconds the program will just quit and won't print anything.
        sleep(5000);
    }

    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
