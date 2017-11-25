package base.proxy.aopframework;

import java.io.InputStream;
import java.util.Collection;

public class AopFrameWorkTest {
    public static void main(String[] args) {
        InputStream inputStream = AopFrameWorkTest.class.getResourceAsStream("config.properties");
        Object bean = new BeanFactory(inputStream).getBean("xxx");
        System.out.println(bean.getClass().getName());
        ((Collection) bean).clear();
    }
}
/**
 static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
 　　newProxyInstance方法用来返回一个代理对象，
 这个方法总共有3个参数，ClassLoader loader用来指明生成代理对象使用哪个类装载器，
 Class<?>[] interfaces用来指明生成哪个对象的代理对象，通过接口指定，
 InvocationHandler h用来指明产生的这个代理对象要做什么事情。
 */