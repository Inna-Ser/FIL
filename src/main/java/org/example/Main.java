package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//      Task #1
        Number t1 = new Number(5);
        Number t2 = new Number(1);
        Number t3 = new Number(-2);
        Number t4 = new Number(-8);

//      реализация через анонимный класс
        Predicate<Number> tPredicate = new Predicate<Number>() {
            @Override
            public boolean test(Number t) {
                return t.getN() >= 0;
            }
        };
        System.out.println(tPredicate.test(t3));

//      через лямбда-выражение
        Predicate<Number> predicate = number -> number.getN() >= 0;
        System.out.println(predicate.test(t1));

//      Task #2
        Person person1 = new Person("Boris", 45);
        Person person2 = new Person("Lena", 25);
        Person person3 = new Person("Gleb", 10);

//      реализация через анонимный класс
        Consumer<Person> personConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person person) {
                System.out.println("Hello" + person);
            }
        };
        personConsumer.accept(person2);

//      через лямбда-выражение
        Consumer<Person> personConsumer1 = person -> System.out.println("Hello" + person);
        personConsumer1.accept(person1);

//      Task #3
double num = 5.4;

//      реализация через анонимный класс
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return aDouble.longValue();
            }
        };
        System.out.println(function.apply(num));

//      через лямбда-выражение
        Function<Double, Long> longFunction = aDouble -> aDouble.longValue();
        System.out.println(longFunction.apply(num));

//      Task #4
//      реализация через анонимный класс
        Supplier<Long> supplier = new Supplier<>() {
            @Override
            public Long get() {
                return (long) (Math.random()*100);
            }
        };
        System.out.println(supplier.get());

//      через лямбда-выражение
        Supplier<Long> supplier1 = () -> (long) (Math.random()*100);
        System.out.println(supplier1.get());

//      Task #5
            Predicate<Object> condition = Objects::isNull; ;
            Function<Person, Integer> ifTrue = obj -> 0;
            Function<Person, Integer> ifFalse = t -> t.getAge();
            Function<Person, Integer> t = ternaryOperator(condition, ifTrue, ifFalse);

            System.out.println(t.apply(person3));
        }

    public static <T, U> Function<T, U> ternaryOperator(
        Predicate<? super T> condition,
        Function<? super T, ? extends U> ifTrue,
        Function<? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }

}