package base.proxy.aopframework;

import java.lang.reflect.Method;

public interface Advice {
        void beforeMethod(Method method);
        void aftereMethod(Method method);
}
