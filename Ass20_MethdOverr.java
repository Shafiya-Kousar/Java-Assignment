package assignment;
 class SuperClass
{
	void method1() {
		System.out.println("Method Overriden");
	}


}
 class SubClass extends SuperClass
 {
	 void method1() {
		 int a=10,b=20,sum=a+b;
		 System.out.println("Sub class method" +a +b +sum);
	 }
	 
 }
public class Ass20_MethdOverr
{
	public static void main(String[] args) {
		SubClass s=new SubClass();
		s.method1();
		

	}

}
