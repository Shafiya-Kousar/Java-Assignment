package assignment;
class SuperClass10
{
	SuperClass10(int a,int b)
	{
		System.out.println("Super Class Constructor");
		int add=a+b;
		System.out.println("a->" +a);
		System.out.println("b->" +b);
		System.out.println("sum->" +add);
	}
}
class SuperClass11 extends SuperClass10
{
	
   SuperClass11(String s)
{
		super(10,20);
		System.out.println(" Parameterised constructor of class1");
		System.out.println(s);
	}
}
class SuperClass21 extends  SuperClass11
{

	SuperClass21(int a)
	{
		super("Shafiya");	
		System.out.println(" Parameterised constructor of class2");
		System.out.println(a);
	}
}


public class Ass18_SuperParamMethod extends SuperClass21 {

	Ass18_SuperParamMethod() {
		super(3);
		System.out.println("Child Class Constructor");
		
	}

	public static void main(String[] args) {
		
		new Ass18_SuperParamMethod();
		
	}

}
