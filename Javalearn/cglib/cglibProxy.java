package cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class cglibProxy implements MethodInterceptor {
    private Enhancer enhancer=new Enhancer();

    public Object create(Object object){
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect=new MyAspect();
        myAspect.checkFirst();
        Object object=methodProxy.invokeSuper(o,objects);
        myAspect.checkEnd();
        return object;
    }
}
