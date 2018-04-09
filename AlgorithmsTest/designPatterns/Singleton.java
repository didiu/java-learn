/**
 * 单例模式：使特定的类只产生一个类
 * 实现方法：构造函数私有，访问对象设为static
 * 适用场景:  1.要求生成唯一序列号
 * 			 2.在整个项目里需要一个共享访问点或共享数据
 *           3.需要定义大量的静态常量或者静态方法（如工具类）的环境
 *           4.创建一个对象需要消耗的资源太多，如访问Io或者数据库
 * */
package designPatterns;

class Singleton {
    private static final Singleton singleton=new Singleton();
    //限制产生多个对象
    private Singleton(){
    }
    public static Singleton getSingleton(){
        return singleton;
    }
    public static void dosomething(){
    }
}
