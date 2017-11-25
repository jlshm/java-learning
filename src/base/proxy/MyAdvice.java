package base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyAdvice implements Advice {
    @Override
    public void beforeMethod(Method method){
        System.out.println("执行" + method.getName() + "前");
        String[] a = new String[]{};//数组测试
    }
    @Override
    public void aftereMethod(Method method){
        System.out.println("执行" + method.getName() + "后");
    }

    private static Object getProxy(final Object target, Advice advice){
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        advice.beforeMethod(method);
                        Object ret = method.invoke(target,objects);
                        advice.aftereMethod(method);
                        return ret;
                    }
                }
        );
        return proxy;
    }

    public static void main(String[] args){
        Object o = getProxy(new String("a"),new MyAdvice());
        o.toString();
    }
}
