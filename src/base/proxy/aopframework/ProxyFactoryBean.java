package base.proxy.aopframework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyFactoryBean {
    private Object object;
    private Advice advice;
    //代理类proxy和委托类object通常会实现相同的接口,实现interfaces

    public Object getProxy(){
        Object proxy = Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                        advice.beforeMethod(method);
                        Object o1 = method.invoke(object,objects);
                        advice.aftereMethod(method);
                        return o1;
                    }
                });
        return proxy;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Advice getAdvice() {
        return advice;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
