package base.binary;

/**
 *
 * https://www.cnblogs.com/zhangziqiu/archive/2011/03/30/ComputerCode.html
 *
 * 在计算机中，负数以原码的补码形式表达。
 * 为了解决原码做减法的问题, 出现了反码
 */
public class Binary {
    public static void main(String[] args){
        int i = 5;
        int j = 10;//1010
        System.out.println(i + ~j);// ~j 0101
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(~j));
        int[] arr = new int[] {3, -2};
        for (int a : arr) {
            //原数
            System.out.println("a:" + a + "  二进制:" + Integer.toBinaryString(a));
            // 按位取反
            System.out.println("~a:" + ~a + "  二进制:" + Integer.toBinaryString(~a));
            // 相反数
            System.out.println("-a:" + -a + "  二进制:" + Integer.toBinaryString(-a));//负数以原码的补码形式表达

            System.out.println(-a == ~a + 1);//补码等于反码加一
            System.out.println(~a == -a - 1);
        }
    }
}
