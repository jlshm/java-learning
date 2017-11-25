package base.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

public class ProxyTest {
    public static void main(String[] args) throws Exception {
        Class classProxy = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
        System.out.println(classProxy);
        printConstructors(classProxy);
        printMethods(classProxy);

    }

    /**
     * 打印构造方法列表
     * @param clazz
     */
    public static void printConstructors(Class clazz){
        System.out.println("-------------constructors list-------------");
        Constructor[] constructors = clazz.getConstructors();
        System.out.print(getExecutableList(constructors));
    }

  /**
   * 打印成员方法列表
   * @param clazz
   */
    public static void printMethods(Class clazz) {
    System.out.println("-------------methods list-------------");
    Method[] methods = clazz.getMethods();
    System.out.print(getExecutableList(methods));
}

    /**
     * 获取要打印的列表数据
     * 每行一个方法,按照func(arg1,arg2)的格式
     * @param executables
     * @return
     */
    public static String getExecutableList(Executable[] executables){
        StringBuilder stringBuilder = new StringBuilder();
        for (Executable executable : executables) {
            String name = executable.getName();
            stringBuilder.append(name);
            stringBuilder.append("(");
            Class[] clazzParams = executable.getParameterTypes();
            for (Class clazzParam : clazzParams) {
                stringBuilder.append(clazzParam.getName()).append(",");
            }
            if (clazzParams != null && clazzParams.length != 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append(")\n");
        }
        return stringBuilder.toString();
    }
}
