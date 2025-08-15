package javaa;

public class abstcrdchld extends abstrct {

		// TODO Auto-generated method stub

	
  public void  abstcrdc() {
	  System.out.println("this is abstcrdchld xlss methid");
  }
  @Override
	public void mthd() {
System.out.println("this is extend1");		
	}

	@Override
	public void prnt() {
		// TODO Syso-generated method stub
		System.out.println("this is unextended2");
	}
	public static void main(String[] args) {
		
		abstcrdchld c = new abstcrdchld();
		c.prnt();
		c.mthd();
		c.abstcrdc();
		c.nature();
		c.cycle();
}
}