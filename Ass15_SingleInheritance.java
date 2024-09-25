package assignment;

public class Ass15_SingleInheritance extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass15_SingleInheritance a=new Ass15_SingleInheritance();//object of child class
		a.method1();
		Parent p =new Parent();//Object of parent class
		p.method1();
		

	}

}
 class Parent
{

	 void method1()
	 {
		 System.out.println("Call non static method from child class");
		 int sum=10+5;
		 System.out.println(sum);
	 }
}
