package cglib;

import jdkProxy.UserDao;

public class UserDaoImpl1 implements UserDao {
    @Override
    public void say(){
        System.out.println("this is say...");
    }
    @Override
    public void endSay(){
        System.out.println("This is endSay...");
    }
}
