package base.proxy;

import java.lang.reflect.Method;

public interface Advice {
    void beforeMethod(Method method);
    void aftereMethod(Method method);
}
