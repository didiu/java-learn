package 基础语法及进阶知识;

public class Chouxianglei extends Graph {

	public void area(){
		System.out.println("此方法已经被重写");
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Chouxianglei cx=new Chouxianglei();
		cx.area();
		cx.show();
	}
}

abstract class Graph{
	String name;
	public Graph(){}
	public abstract void area();
	public void show(){
		System.out.println("小楼一夜风吹雨");
	}
}
