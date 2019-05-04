package textToHTMLConversion;
import java.util.Scanner;


public class TextToHTML {

	public static void main(String[] args) {
		
		System.out.println("Enter filename");
		Scanner scanner = new Scanner(System.in);
		String filename = scanner.nextLine();
		scanner.close();
		
		Text.InputText(filename);
		Text.DisplayInputFile();
	}
}
