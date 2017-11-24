package corejava.argumentsTest;

/**
 *  run/debug configurations test
 *  @author lin
 */

public class ArgumentsTest {
    public static void main(String args[]){
        for(int i = 0;i<args.length;i++){
            System.out.println(args[i]);
        }
        String test = System.getProperty("test");
        System.out.println(test);
        String a = System.getProperty("a");
        System.out.println(a);
    }
}
