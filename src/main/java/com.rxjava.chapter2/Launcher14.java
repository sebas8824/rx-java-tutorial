package com.rxjava.chapter2;

import io.reactivex.Observable;

public class Launcher14 {
    private static int start = 1;
    private static int count = 5;
    public static void main(String[] args) {
        /* Observable.defer() has the ability to create separate states for each Observers*/

        // Starting this example by using a common Observable.range
        /* Observable<Integer> source = Observable.range(start, count);
        source.subscribe(i -> System.out.println("Observer 1: " + i));

        // After changing count, the observer won't see this change and will print 5 results anyway
        count = 8;
        source.subscribe(i -> System.out.println("Observer 2: " + i)); */

        /* Now by using .defer() the observable will return its own count of values independently */
        Observable<Integer> source = Observable.defer(() -> Observable.range(start, count));
        source.subscribe(i -> System.out.println("Observer 1: " + i));

        count = 9;
        source.subscribe(i -> System.out.println("Observer 2: " + i));
    }
}
