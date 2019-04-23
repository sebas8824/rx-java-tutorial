package com.rxjava.chapter2;

import io.reactivex.Observable;
import io.reactivex.functions.Action;

import java.util.function.Consumer;

public class Launcher5 {
    public static void main(String[] args) {
        /*Shorthand Observers with lambdas */
        Consumer<Integer> onNext = i -> System.out.println("RECEIVED onNext: " + i);
        Action onComplete = () -> System.out.println("Done onComplete!");
        Consumer<Throwable> onError = Throwable::getMessage;

        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon");

        /* Approach with all the overloads of each event */
        source.map(String::length).filter(i -> i >= 5).subscribe(i -> System.out.println("RECEIVED with all events: "+ i),
                Throwable::printStackTrace,
                () -> System.out.println("Done with all events!"));

        /* Approach with onNext and onError overloaded, onComplete will have the default
        * behaviour under the Observer interface */
        source.map(String::length).filter(i -> i >= 5).subscribe(i -> System.out.println("RECEIVED with onNext and onError: " + i), Throwable::printStackTrace);

        /* Approach with onNext overloaded */
        source.map(String::length).filter(i -> i >= 5).subscribe(i -> System.out.println("RECEIVED with onNext: " + i));
    }
}
