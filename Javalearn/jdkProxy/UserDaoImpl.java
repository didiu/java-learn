package jdkProxy;

public class UserDaoImpl implements UserDao {
    @Override
    public void say(){
        System.out.println("this is say...");
    }
    @Override
    public void endSay(){
        System.out.println("This is endSay...");
    }
}
