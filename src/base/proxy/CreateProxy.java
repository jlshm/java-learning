package base.proxy;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collection;


public class CreateProxy {
    private static void creatProxyInstance() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 方法1：先创建代理类，再使用反射创建实例对象
         */
        Class classProxy = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
        Constructor constructor = classProxy.getConstructor(InvocationHandler.class);
        Collection proxy = (Collection) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                return null;
            }
        });


        /**
         * 方法2：直接使用newProxyInstance方法创建实例对象
         */
        Collection proxy1 = (Collection) Proxy.newProxyInstance(Collection.class.getClassLoader(), new Class[]{Collection.class}, new InvocationHandler() {
            ArrayList target = new ArrayList();
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                System.out.println("before invoke method: "+method.getName());
                return method.invoke(target,objects);
            }
        });

        proxy1.add("aaa");
        proxy1.add("bbb");
        System.out.println(proxy1.size());
        System.out.println(proxy1);
        System.out.println(proxy1.getClass().getName());
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        creatProxyInstance();
    }
}
