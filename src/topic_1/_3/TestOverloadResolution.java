package topic_1._3;

import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/**
 * @author jjsanche
 */
public class TestOverloadResolution {

    public static void main(String[] args) {
//        print(s -> s.length()); //compilation error
        print((String s) -> s.length());
//        ex(Exception::new); //compilation error
        TestOverloadResolution.<Exception>ex(Exception::new);
        TestOverloadResolution.<String, Exception>ex(Exception::new);
        
//        bar(String::valueOf); //compilation error
          bar((IntFunction<String>) String::valueOf);
          bar((DoubleFunction<String>) String::valueOf);
          
//          customFunction(s -> s.length()); //compilation error
          customFunction((String s) -> s.length());
    }

    public static<T,U> void print(Function<T,U> o) {
        System.out.println("Function");
    }

    public static<T> void print(ToIntFunction<T> t) {
        System.out.println("ToIntFunction");
    }
    
    static <T> void ex(Supplier<T> factory) {
        System.out.println("Supplier ex");
    }
    
    static <T,U> void ex(Function<T,U> transformer) {
        System.out.println("Function ex");
    }
    
    static void bar(IntFunction<String> f){
        System.out.println("IntFunction");
    }
    
    static void bar(DoubleFunction<String> f){
        System.out.println("DoubleFunction");
    }
    
    static <T,R> void customFunction(MyFuncion<T,R> mf) {
        System.out.println("MyFuncion");
    }
    
    static <T> void customFunction(MyIntFuncion<T> mif) {
        System.out.println("MyIntFuncion");
    }
}

@FunctionalInterface
interface MyFuncion<T, R> {
    R aplica(T t);
}

@FunctionalInterface
interface MyIntFuncion<T> {
    int aplica(T t);
}