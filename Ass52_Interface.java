package assignment;

interface Intere
{
	void method1();
	void method2();
}
public class Ass52_Interface implements Intere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass52_Interface ai=new Ass52_Interface();
		ai.method1();
		ai.method2();
	}

	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 of interface");
	}

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 of interface");
		
	}

}
