package assignment;

interface Inter1
{
	void implme();
	
}
abstract class AbstClass
{
	abstract void extens();
}
public class Ass53_ExtendsImplem extends AbstClass implements Inter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass53_ExtendsImplem ae =new Ass53_ExtendsImplem();
		ae.implme();
		ae.extens();
	}

	@Override
	public void implme() {
		// TODO Auto-generated method stub
		System.out.println("implementing interface");
	}

	@Override
	void extens() {
		// TODO Auto-generated method stub
		System.out.println("extending abstract class");
	}

}
