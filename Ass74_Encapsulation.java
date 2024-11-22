package assignment;

public class Ass74_Encapsulation {
	
	private String uname="Shafiya";
	private String pwd="Sh@1234";
	

	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getPwd() {
		return pwd;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass74_Encapsulation en=new Ass74_Encapsulation();
	    en.setUname("Kousar");
		en.setPwd("9780");
		System.out.println(en.getUname());
		System.out.println(en.getPwd());

	}

}
