package io.github.onlynight.demo.java.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceFactory implements InvocationHandler {

    public <T> T createService(Class<T> clazz) {
        return (T) Proxy.newProxyInstance(clazz.getClassLoader(),
                new Class<?>[]{clazz}, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
