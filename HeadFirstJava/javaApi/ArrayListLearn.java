package javaApi;
import java.util.ArrayList;
public class ArrayListLearn {
	public static void main(String[] args) {
		ArrayList<Egg> myList=new ArrayList<Egg>();
		
		Egg a=new Egg();
		myList.add(a);
		
		Egg b=new Egg();	
		myList.add(b);
		
		System.out.println(myList.size());
		System.out.println(myList.contains(b));
		System.out.println(myList.indexOf(b));
		System.out.println(myList.isEmpty());
		
	}
}

class Egg{
}