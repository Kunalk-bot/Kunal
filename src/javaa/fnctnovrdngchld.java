package javaa;

public class fnctnovrdngchld extends fnctnovrdng {

	public void givname(String name) {
		System.out.println("there are having name as fnctnovrdng second" + " " + name);/////// commnt it out to see
																						/////// fnctn ovrding
	}

	public void givnum(int b) {
		System.out.println("there are having name as fnctnovrdng " + " " + b);
		System.out.println(super.city);

	}

	public void supr(String name) {
		System.out.println(
				"THis is example of super key word super keyword allow to acess parents objects and method even if local varib;le priortise during overwriting like this "); super.givname(name);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fnctnovrdngchld c = new fnctnovrdngchld();
		c.givname("aukui");
		c.givname("parent");
		c.givnum(7);

	}

}
