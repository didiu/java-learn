package javaApi;

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
}
