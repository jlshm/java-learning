package base.datatype;

/**
 * Integer.valueOf
 */
public class AutoBoxing {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        print(a == b);//false
        print(c == d);//true
        print(e == f); // 未缓存 [-127, 128]缓存
        //Integer.valueOf(321); source code
        print(c == (a + b));//true
        print(c.equals(a + b));//true 比较值
        print(g == (a + b));//true 基本类型比较值
        print(g.equals(a + b));//false 类型不对
        print(new Integer(1) == new Integer(1)); //比较地址 false

    }
    private void print(String message){
        System.out.println(message);
    }
    private static void print(Boolean b){
        System.out.println(b);
    }
}
