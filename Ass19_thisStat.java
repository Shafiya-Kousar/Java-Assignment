package assignment;

public class Ass19_thisStat {
	
	Ass19_thisStat()
	{
	 System.out.println("Non-Parametrised constructor caled by this() from other constructor");	
	}
	Ass19_thisStat(int a)
	{
		this();
		System.out.println("Parameterised constructor called by this() passing parameter" +a);
		
	}
	Ass19_thisStat(String name, int age)
	{
		this(5);
		System.out.println("Parameterised constructor called by object creation" +name +age);
		
	}

	public static void main(String[] args) {
		new Ass19_thisStat("Shafiya" , 30);

		
	}

}
