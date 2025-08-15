package javaa;

public class Constructordemo {

		// TODO Auto-generated method stub
		
		public Constructordemo() 
		{
			System.out.println("im parameerized constructor");
			
		}
		public Constructordemo(int x , String name) 
		{
			System.out.println("im parameerized constructor"  + "  " + name +"," + "  " + x);
			
		}
		public Constructordemo(int a, int b) 
		{
			System.out.println("im parameerized constructor"  + "  " + a +"," + "  " + b);
			
		}
		
		
		
		public static void main(String[] args) {
			Constructordemo ct = new Constructordemo();

			Constructordemo ct2 = new Constructordemo(11 , "safar");
			Constructordemo ct1 = new Constructordemo(19 , 20);

			


	}

}
