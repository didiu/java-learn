package 基础语法及进阶知识;
/*
 * java继承
 * */
public class Jicheng{
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		anamil dg= new dog();
		dg.bork();
		System.out.println(dg.a);
	}

}
class anamil{
	public int a=0;
	public void bork(){
		System.out.println("叫声");
	}
	public void sleep(){
		System.out.println("睡觉");
	}
}
class dog extends anamil{
	public int a=10;
	public void bork(){
		System.out.println("谁在叫？狗在叫");
		super.bork();
	}
	public void sleep(){
		System.out.println("狗在睡觉");
		super.sleep();
	}
}