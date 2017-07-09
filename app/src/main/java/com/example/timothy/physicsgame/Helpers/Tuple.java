package com.example.timothy.physicsgame.Helpers;

/**
 * Created by timothy on 7/8/17.
 */

public class Tuple<X,Y> {
    private X first;
    private Y second;

    public Tuple(X one, Y two) {
        first = one;
        second = two;
    }

    public X getFirst() {return first;}
    public Y getSecond() {return second;}
}
