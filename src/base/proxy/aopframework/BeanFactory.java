package base.proxy.aopframework;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    Properties properties = new Properties();

    public BeanFactory(InputStream inputStream){
        try{
            properties.load(inputStream);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public  Object getBean(String name) {
        String className = properties.getProperty(name);
        Object bean = null;
        try {
            Class clazz = Class.forName(className);
            bean = clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (bean instanceof ProxyFactoryBean){
            ProxyFactoryBean proxyFactoryBean = (ProxyFactoryBean)bean;
            Advice advice = null;
            Object object = null;
            try {
                advice = (Advice) Class.forName(properties.getProperty(name+".advice")).newInstance();
                object = Class.forName(properties.getProperty(name+".target")).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            proxyFactoryBean.setAdvice(advice);
            proxyFactoryBean.setObject(object);
            Object proxy = proxyFactoryBean.getProxy();
            return proxy;
        }
        return bean;

    }
}
