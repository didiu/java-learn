package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private Object objects;

    public JdkProxy(Object object) {
        this.objects = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.checkFirst();
        Object object = method.invoke(objects, args);
        myAspect.checkEnd();
        return object;
    }
}