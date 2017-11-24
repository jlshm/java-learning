package corejava.methods;

import java.lang.reflect.Method;

/**
 *This program shows how to invoke corejava.methods through corejava.reflection
 * @author lin
 */
public class MethodTableTest {
    public static void main(String args[]) throws  Exception{
        Method square = MethodTableTest.class.getMethod("square",double.class);
        Method sqrt = Math.class.getMethod("sqrt", double.class);
        printTable(1, 10, 10, square);
        printTable(1, 10, 10, sqrt);
    }

    /**
     * @param x a double number
     * @return x squared
     */
    public static double square(double x){
        return x * x;
    }

    /**
     *
     * @param from  the lower bound for the x-values
     * @param to  the upper bound for the x-values
     * @param n the num of rows
     * @param f a method with a double parameter and double return value
     */
    public static void printTable(double from ,double to, int n,Method f){
        System.out.println(f);
        double dx = (to - from)/(n-1);
        for (double x = from;x <= to; x += dx) {
            try {
                //invoke static method
                double y = (Double) f.invoke(null, x);
                System.out.printf("%10.4f | %10.4f%n", x, y);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
