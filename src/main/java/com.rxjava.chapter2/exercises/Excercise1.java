package com.rxjava.chapter2.exercises;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

public class Excercise1 {
    public static void main(String[] args) {
        /* This is a cold observable because each emission is initialized independently alongside 10 seconds (hence the sleep(5000) twice) */
        //Observable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS);

        /* This one is a hot observable because it publishes the emissions and the emissions are synced
        * the observer1 starts form 0 to 9, but observer2 starts from 4 to 9 (because it starts on the 5th seconds of observer1)*/
        ConnectableObservable<Long> seconds = Observable.interval(1, TimeUnit.SECONDS).publish();

        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
        seconds.connect();
        sleep(5000);

        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
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
