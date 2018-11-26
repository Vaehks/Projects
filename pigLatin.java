/*
Victor Diaz
11/25/2018
CST-105
Lisa Hebert
 */
import java.util.Scanner;
import java.io.*;


public class pigLatin {

	public static void main(String[] args) throws FileNotFoundException {
		String word;
		Scanner input = new Scanner(new File("C:\\Users\\Vic\\Desktop\\GCU\\CST-105\\Projects\\program\\src\\Critter.txt"));
		
		while (input.hasNextLine()) {		// 
			String phrase = input.nextLine();
			System.out.print("\"" + phrase + "\" in pig latin is \"");
			Scanner inPhrase = new Scanner(phrase);

			while (inPhrase.hasNext()) {	// 
				word = inPhrase.next();
				System.out.print(pigLatinWord(word) + " ");
			}
			System.out.println("\"");
			System.out.println();
		}
		input.close();
	}

	
	public static String pigLatinWord(String s) {
		String pigWord;
		int i = 0;
		while (!isVowel(s.charAt(i))){		
			i++;
		}
		if (i == 0) {
			pigWord = s + "-way";
		} else {
			pigWord = s.substring(i) + "-" + s.substring(0, i) + "ay";
		}
		return pigWord;
	}

	
	public static boolean isVowel(char c) {
		String vowels = "aeiouAEIOU";
		return (vowels.indexOf(c) >= 0); 
	}
}