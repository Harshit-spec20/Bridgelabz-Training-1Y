package src.com.gla.interfaces-abstraction.Level1;


import java.util.function.Function;

public class StringLengthChecker{
    public static void main(String[] args){
        Function<String,Integer> length = s -> s.length();

        String msg = "Hello Java";
        System.out.println("Length: " + length.apply(msg));
    }
}
