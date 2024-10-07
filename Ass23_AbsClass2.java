package assignment;

abstract class SuperCass
{
	abstract void abs_method1();
	abstract void abs_method2();
	void con_method1() {
		System.out.println("Concrete method1 in abstract class");
	}
	void con_method2() {
		System.out.println("Concrete method2 in abstract class");
	}
}
public class Ass23_AbsClass2 extends SuperCass {
	
	void con_method11()
	{
		System.out.println("Concrete method1 in Super class");
	}

	void con_method12()
	{
		System.out.println("Concrete method2 in Super class");
	}
	
	void abs_method1()
	{
		System.out.println("Method1 from Abstract Class");
	}

	void abs_method2()
	{
		System.out.println("Method2 from Abstract Class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ass23_AbsClass2 ac=new Ass23_AbsClass2();
		ac.abs_method1();
		ac.abs_method2();
		ac.con_method1();
		ac.con_method2();
		ac.con_method11();
		ac.con_method12();
	}

}
