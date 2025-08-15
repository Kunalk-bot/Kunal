package javaa;

public class reverse {

	public static void main(String[] args) {

		String words[] = { "akaka", "diomnds", "hoohoohooh" };

		for (String word : words) {
			StringBuilder reversed = new StringBuilder(word).reverse();

			if (word.equals(reversed.toString())) {
				System.out.println(word+"  ==="+"this is palindrom");
			} else {
				System.out.println(word+"  ==="+"this is NOT  palindrom");
			}

			// TODO Auto-generated method stub

			String orignal = "keyword";
			StringBuilder revers = new StringBuilder();
			// String revers="";

			for (int i = orignal.length() - 1; i >= 0; i--) {
				revers.append(orignal.charAt(i));
			}
			// revers+= orignal.charAt(i);

			System.out.println("outside loop " + "    " + revers);

			System.out.println("Single word palindrom");
			if (orignal.equals(revers)) {
				System.out.println("this is palindrom");
			} else {
				System.out.println("not plaindrom");

			}

		}
	}
}
