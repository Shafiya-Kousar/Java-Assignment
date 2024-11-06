package assignment;

interface InterfaceClass1
{
	void display();
	void print();
}
abstract class AbsClass11
{
	public abstract void show();
	public abstract void fetch();
	public void method1()
	{
		System.out.println("concrete method of abs class");
	}
	public void method2()
	{
		System.out.println("concrete method 2 of abs class");
	}
	
}
public class Ass51_InterfaceAbstract extends AbsClass11 implements InterfaceClass1 {
	public void display()
	{
		System.out.println("display method of inteface");
	}

	public void print()
	{
		System.out.println("print method of interface");
	}
	public void show() {
		System.out.println("Show methos of abs class");
	}
	public void fetch()
	{
		System.out.println("fetch mehod of abs class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass51_InterfaceAbstract a1=new Ass51_InterfaceAbstract();
		a1.display();
		a1.fetch();
		a1.print();
		a1.show();
		
	}

}
