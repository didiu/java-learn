package 基础语法及进阶知识;

public class Jiekou {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}
}
interface Cat{
	void run();
}
interface Animal{
	void bark();
	void eat();
}  
interface Mouse extends Animal{
	void run();
}
class AC implements Cat, Animal {

	@Override
	public void bark() {
	}

	@Override
	public void eat() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
	}
	
}