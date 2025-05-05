package basic.to.intermediate;

import java.util.Scanner;

class SimpleStringEncoding{

	public void StringEncoding(String str){

		char[] ch = new char[5];

		for(int k = 0; k < str.length(); k++){
			ch[k] = str.charAt(k);
		}

		System.out.print("Encoded Word: ");

		for (int i = 0; i <= 4; i++) {
			char ch1 = ch[i];
			int dv = ch1 - 1;
			char ch2 = (char) dv;
			System.out.print(ch2);
		}
	}
}

public class Q07_SimpleStringEncoding {
	
	/**
	 * This program reads a five-letter word from the user and encodes 
	 it by subtracting 1 from the ASCII value of each character. 
	 It then prints the newly encoded word.
	 
	 Problem Flow:
	Get 5-letter word input
	Loop each character → subtract 1 from ASCII
	Build new string with changed characters
	Print encoded result
	
	Input / Output Example:
	Input:
	Enter a Five letter word: white
	Output:
	Encoded Word: vghsd
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Five letter word: ");
		String str = scanner.nextLine();

		SimpleStringEncoding SSE = new SimpleStringEncoding();
		SSE.StringEncoding(str);
	}
}
