package �����﷨������֪ʶ;

public class Chouxianglei extends Graph {

	public void area(){
		System.out.println("�˷����Ѿ�����д");
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
		System.out.println("С¥һҹ�紵��");
	}
}
