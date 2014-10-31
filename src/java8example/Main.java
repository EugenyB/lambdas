package java8example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author Eugeny
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("first", "second", "another", "line"));
        list.stream().forEach(System.out::println);
        System.out.println("-------------");
        list.stream().filter(s -> s.length() > 5).forEach(System.out::println);
        System.out.println("-----------------");
        Double[] arr = {3.4, -5.0, 10.1, 0.2, -7.1};
        Double res = Stream.of(arr).filter(x -> x<0).max((a,b) -> Double.compare(a, b)).get();
        System.out.println("res = " + res);
        Double sum = Stream.of(arr).filter(x -> x<0).reduce(0.0, (a,b) -> Double.sum(a, b));
        System.out.println("sum = " + sum);
        String s = list.stream().max((a,b) -> Integer.compare(a.length(), b.length())).get();
        System.out.println("s="+ s);
    }
    
}
