package corejava.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.function.BiFunction;
import javax.swing.*;

public class LambdaTest {
    public static void main(String[] args){

        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                    "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets,( first, sendcond)->first.length()- sendcond.length());
        System.out.println(Arrays.toString(planets));
        Timer timer = new Timer(1000, event ->
        System.out.println("The time is"+ new Date()));// lambda can convert to interface
        timer.start();
        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
        BiFunction<String, String, Integer> comp
                = (first, second) -> first.length() - second.length();
        /*
         *         public interface Predicate<T>
                {
                     boolean test(T t);
                    // Additional default and static methods
                }
                list.removeIf(e -> e == null);//The ArrayList class has a removeIf method
                whose parameter is a Predicate
         */
    }
}

/*BiFunction<T, U, R>   describes functions
with parameter types T and U and return type R
BiFunction<String, String, Integer> comp
= (first, second) -> first.length() - second.length();

        (String first, String second)
        ->{
            if(first.length() < second.length()) return -1;
            else if(first.length() > second.length()) return 1;

            else return 0;
        }

        Comparator<String> comp
                = (first, second) // Same as (String first, String second)
                -> first.length() - second.length();*/