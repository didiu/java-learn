package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private Object userDao;

    public JdkProxy(Object userDao) {
        this.userDao = userDao;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.checkFirst();
        Object object = method.invoke(userDao, args);
        myAspect.checkEnd();
        return object;
    }
}