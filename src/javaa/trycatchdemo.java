package javaa;

public class trycatchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =1;
		int b=0;
		int c= 0;
		try {
			c=  a/b;
			System.out.println(c);
		}
		 catch(Exception e){
			 System.out.println("i couhjt exception ");
		 }

	}

}
