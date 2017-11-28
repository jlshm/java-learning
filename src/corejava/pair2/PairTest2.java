package corejava.pair2;

import java.io.Serializable;

public class PairTest2 {

    public static void main(String[] args)
    {
        String[] words = { "Mary", "had", "a", "little", "lamb" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        System.out.println(ArrayAlg.getMiddle(words));
    }

    static class ArrayAlg
    {
        /**
         * Gets the minimum and maximum of an array of strings.
         * @param a an array of strings
         * @return a pair with the min and max value, or null if a is null or empty
         */
        public static <T extends Comparable & Serializable> Pair<T> minmax(T[] a) {
        //A type variable or wildcard can have multiple bounds.
            if (a == null || a.length == 0) {
                return null;
            }
            T min = a[0];
            T max = a[0];
            for (int i = 1; i < a.length; i++)
            {
                if (min.compareTo(a[i]) > 0 ){
                    min = a[i];
                }
                if (max.compareTo(a[i]) < 0){
                    max = a[i];
                }
            }
            return new Pair<>(min, max);
        }

        public static <T> T getMiddle(T... a)
        {
            return a[a.length / 2];
        }
    }
}
