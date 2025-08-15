package javaa;

public class intfceuse implements intrfce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intfceuse t =new intfceuse();
		t.redstop();
		t.greengo();
		t.yelowhold();

	}

	@Override
	public void redstop() {		
		System.out.println("redstop");
	}

	@Override
	public void greengo() {
		System.out.println("greengp");
	}

	@Override
	public void yelowhold() {
System.out.println("yelowhold");		
	}

}
