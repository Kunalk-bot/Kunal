package javaa;

public class thisdemo {

	
	int n=2;////global variable
	
	public void getdata()
	{
		
		int n=7 ;/// locala variable 
		int d = n+this.n;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thisdemo t = new thisdemo();
		t.getdata();
		

	}

}
