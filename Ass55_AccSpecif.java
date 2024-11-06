package assignment;

class Ass55_Class1
{
	public void show() {
		System.out.println("public show");
	}
	private void display()
	{
		System.out.println("private display");
	}
	protected void print()
	{
		System.out.println("protected print");
	}
	 void test()
	{
	 System.out.println("default testing");	
	}
}
public class Ass55_AccSpecif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass55_Class1 ac= new Ass55_Class1();
		ac.show();
		ac.test();
		ac.print();
	}

}
