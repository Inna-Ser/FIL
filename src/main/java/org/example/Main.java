package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Number t1 = new Number(5);
        Number t2 = new Number(1);
        Number t3 = new Number(-2);
        Number t4 = new Number(-8);

        List<Number> numberList = new ArrayList<>();

        numberList.add(t1);
        numberList.add(t2);
        numberList.add(t3);
        numberList.add(t4);

        Predicate<Number> tPredicate = new Predicate<Number>() {
            @Override
            public boolean test(Number t) {
                return t.getN() >= 0;
            }
        };

        Predicate<Number> predicate = number -> number.getN() >= 0;
    }
}