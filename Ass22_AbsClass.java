package assignment;

abstract class AbsClass
{
	abstract void add();
	void sub()
	{
		int diff=100-50;
		System.out.println("difference between num" +diff);
	}
	
}
public class Ass22_AbsClass extends AbsClass
{
	void add()
	{
		int sum=100+100;
		System.out.println("adding numbers" +sum);
	}

	public static void main(String[] args) {
		
		Ass22_AbsClass ac=new Ass22_AbsClass();
		//AbsClass ac=new AbsClass();
		ac.add();
		ac.sub();
		
		

	}

}
