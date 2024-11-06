package assignment;
class ParentClass
{
	void paremethod()
	{
		System.out.println("im parent");
	}
}
public class Ass76_Classcasting extends ParentClass {

	public static void main(String[] args) {
		ParentClass p = new Ass76_Classcasting();
		Ass76_Classcasting q=(Ass76_Classcasting)p;
		p.paremethod();
		q.paremethod();
		
	}
}
