package assignment;
class SuperClass1
{
	SuperClass1()
	{
		
		System.out.println("non Parameterised constructor of class1");
	}
   
}
class SuperClass2 extends  SuperClass1
{
	SuperClass2()
	{
		System.out.println("non Parameterised constructor of class2");
		}
	
}
public class Ass17_SuperMethod extends SuperClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ass17_SuperMethod();
		
		
		
		
	}

}
