package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		String back = "backwards";
		Random r = new Random();
		String ul = "abcdefghijklmnopqrstuvwxyz";
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s) -> {
			for (int i = s.length() - 1; i >= 0; i--) {
				System.out.print(s.charAt(i));
			}
		}, back);
		System.out.println();
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if(r.nextBoolean() == true) {
					System.out.print(Character.toUpperCase(s.charAt(i)));
				}
				else {
					System.out.print(s.charAt(i));
				}
			}
		}, ul);
		System.out.println();
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s) -> {
			String l = "";
			for (int i = 0; i < s.length(); i++) {
				l += s.charAt(i) + ".";
			}
			System.out.println(l);
		}, ul);
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s) -> {
			for (int i = 0; i < s.length(); i++) {
				if(!(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')) {
					System.out.print(s.charAt(i));
				}
			}
		}, ul);
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
