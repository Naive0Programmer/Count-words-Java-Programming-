import java.util.Scanner;

public class CountWords {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int wordsCount = 1;
		System.out.format("Enter: ");
		String words = input.nextLine();
		for(int i = 0; i < words.length();i++) {
			if(words.charAt(i) == ' ') {
				wordsCount++;
			}
		}
		System.out.format("Words: %d", wordsCount);
	}
}
