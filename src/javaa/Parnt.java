package javaa;

public class Parnt {
	
	
	String name;
	
	public void getdata(String name)
	{
		System.out.println(name);
	}
	
	public Parnt() {
		System.out.println("parnt constrct");

		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parnt o=new Parnt();
		o.getdata("rahul");

	}

}
