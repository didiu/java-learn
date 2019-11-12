package javaApi;

import cglib.UserDaoImpl1;
import cglib.cglibProxy;
import jdkProxy.JdkProxy;
import jdkProxy.UserDao;
import jdkProxy.UserDaoImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

class JdkProxyTest {
    @Test
    @DisplayName("jdk动态代理")
    void run(){
        UserDao userDao=new UserDaoImpl();
        JdkProxy jdkProxy=new JdkProxy(userDao);

        UserDao userDao1= (UserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),jdkProxy);
        userDao1.say();
        userDao1.endSay();
    }

    @Test
    @DisplayName("cglib ")
    void run2(){
        UserDaoImpl1 userDao=new UserDaoImpl1();
        UserDaoImpl1 userDao1= (UserDaoImpl1) new cglibProxy().create(userDao);
        userDao1.say();
    }
}
