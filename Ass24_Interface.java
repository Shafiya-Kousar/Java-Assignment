package assignment;

interface Interface_ex
{
	void show();
	void config();
	int age=10;
	String area="Mumbai";
	
}
class Super implements Interface_ex
{

	public void show() {
		System.out.println("In show method");
		
	}

	public void config() {
	System.out.println("In config method");
		
	}
	
	void demo()
	{
		System.out.println("In demo method");
	}
	
}
public class Ass24_Interface  {

	public static void main(String[] args) {
		Interface_ex intf;
		//Ass24_Interface ai=new Ass24_Interface();
		Super ai=new Super();
		ai.config();
		ai.show();
		ai.demo();
		System.out.println(ai.age);
		System.out.println(ai.area);
		
		

	}

}
