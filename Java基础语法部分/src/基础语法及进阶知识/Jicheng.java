package �����﷨������֪ʶ;
/*
 * java�̳�
 * */
public class Jicheng{
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		anamil dg= new dog();
		dg.bork();
		System.out.println(dg.a);
	}

}
class anamil{
	public int a=0;
	public void bork(){
		System.out.println("����");
	}
	public void sleep(){
		System.out.println("˯��");
	}
}
class dog extends anamil{
	public int a=10;
	public void bork(){
		System.out.println("˭�ڽУ����ڽ�");
		super.bork();
	}
	public void sleep(){
		System.out.println("����˯��");
		super.sleep();
	}
}