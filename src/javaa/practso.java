package javaa;

public class practso extends Parnt {
	
	int a= 90908989;
	
	
	
	public void code( )
	{
		System.out.println("erwrtrwterytt");
		System.out.println(super.name);
		System.out.println(this.a);
		}
	public practso() {
		
		super();
		System.out.println("child  const");

	}
	
	public void gatedata(String name )
	{
		System.out.println("child method");
		super.getdata(name);
		
		}
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practso p = new  practso() ;
		p.code();
		p.gatedata("saurb");
	}

}
