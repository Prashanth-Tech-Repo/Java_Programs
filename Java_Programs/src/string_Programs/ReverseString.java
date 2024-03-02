package string_Programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String value = sc.nextLine();
		
		ReverseString obj = new ReverseString();
		String reverseValue = obj.reverseString(value);
		System.out.println(reverseValue);
		
		sc.close();

	}

	public String reverseString(String value) {
		String reverseValue = "";
		for (int i = value.length() - 1; i >= 0; i--) {
			reverseValue += value.charAt(i);
		}

		return reverseValue;

	}

}
