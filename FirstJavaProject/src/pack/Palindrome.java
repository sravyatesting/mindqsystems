package pack;

public class Palindrome {

	public static void main(String[] args) {

		String str = "madama";
		String str1 = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {

			str1 = str1 + str.charAt(i);
		}
		if (str.equals(str1)) {

			System.out.println("Palindrome");

		} else {

			System.out.println("Not Palindrome");
		}
	}

}
