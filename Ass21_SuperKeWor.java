package assignment;
class SuperClass12
{
	void method1() {
		System.out.println("Method Overriden and called by super keyword");
	}


}
 class SubClass11 extends SuperClass12
 {
	 void method1() {
		 int a=10,b=20,sum=a+b;
		 System.out.println("Sub class method" +a +b +sum);
		 super.method1();
	 }
	 
 }

public class Ass21_SuperKeWor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SubClass11 sc=new SubClass11();
      sc.method1();
	}

}
