/**
 * 简单工厂模式：
 * */
package designPatterns;

public interface SimpleFactory {
    void grow();
    void plant();
    void harvest();
    String color=null;
    String name=null;
}

class Apple implements SimpleFactory{
    public void grow(){
    }
    public void plant(){
    }
    public void harvest(){
    }

}
class Grape implements SimpleFactory{
    public void grow(){
    }
    public void plant(){
    }
    public void harvest(){
    }

}
class Strawberry implements SimpleFactory{
    public void grow(){
    }
    public void plant(){
    }
    public void harvest(){
    }

}
class FriuitGardener{
    public SimpleFactory factory(String which){
        if(which.equalsIgnoreCase("appple")){
            return new Apple();
        }else if (which.equalsIgnoreCase("strawberry")){
            return new Strawberry();
        }else if (which.equalsIgnoreCase("grape")){
            return new Grape();
        }
        else return null;
    }
}