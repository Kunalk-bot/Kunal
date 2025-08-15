package javaa;

public class fnctnovrloading {

	
		
		
		public void getdeta(int a) {
			System.out.println(a);
		}
		public void getdeta(int a ,String name) {
			System.out.println (a +" "+ name);
		}
		public static void main(String[] args) {
			fnctnovrloading f =new fnctnovrloading();
			f.getdeta(25);
			f.getdeta(25, "rahul");
			
			// TODO Auto-generated method stub

	}

}
