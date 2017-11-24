package base.datatype;

public class NumberEquation {
    public static void main(String[] args) {
        Integer i = 42;
        Long l = 42l;
        Double d = 42.0;

        System.out.println(i.equals(d)); // false
        System.out.println(d.equals(l)); // false
        System.out.println(i.equals(l)); // false
        System.out.println(l.equals(42L)); // true 比较值
    }
}

// (i == l),(i == d),(l == d)会出现编译错误
