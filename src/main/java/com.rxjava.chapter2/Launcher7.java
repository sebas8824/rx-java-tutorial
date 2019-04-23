package com.rxjava.chapter2;

import io.reactivex.Observable;
import io.reactivex.observables.ConnectableObservable;

public class Launcher7 {
    public static void main(String[] args) {
        /* Hot observables are similar to a radio station */
        // All emissions are played to all Observers at once, it requires the usage of .publish()
        /* The example here does a multicasting which means that each emission forces to go to all the Observers simultaneously */
        ConnectableObservable<String> source = Observable
                .just("Alpha", "Beta", "Gamma", "Delta", "Epsilon").publish();

        source.subscribe(s -> System.out.println("Observer 1: " + s));
        source.map(String::length).subscribe(i -> System.out.println("Observer 2: "+ i));
        source.connect();
    }
}
