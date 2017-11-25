package base.proxy.aopframework;

import java.lang.reflect.Method;

//为了保持行为的一致性，代理类和委托类通常会实现相同的接口
public interface Advice {
        void beforeMethod(Method method);
        void aftereMethod(Method method);
}
