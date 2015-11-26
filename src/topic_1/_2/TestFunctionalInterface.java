package topic_1._2;

import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Functional interfaces just have 1 abstract method.
 * 
 * @author jjsanche
 */
public class TestFunctionalInterface {
    public static void main(String[] args) {
        FunctionalInterface fi = () -> System.out.println("functional method");
        fi.functionalMethod();
        
        Consumer consumer = p -> System.out.println("Parameter instanceof String: " + p instanceof String);
        consumer.accept(new Object());
        consumer.accept("hola");
        
        Callable<String> callable = () -> new Object().toString();
        Callable callable2 = () -> new Object();
        
        Function function = f -> f;
        GenericFunctionalInterface gfi = a -> {return "";};
        GenericFunctionalInterface gfi2 = a -> "";
    }
}

interface FunctionalInterface {
    void functionalMethod();
    //This method would cause a compile time error as functional interfaces just have 1 abstract method.
//    void abstractMethod(String s);
}

interface GenericFunctionalInterface<R, T> {
    R genericMethod(T target);
}