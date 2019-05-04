package textToHTMLConversion;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Text {
		
	static ArrayList<String> Text = new ArrayList<String>();		
	public static void InputText(String filename)
	{	
		try {
			Scanner inFile = new Scanner(new FileInputStream(filename));
			while(inFile.hasNextLine())
			{
				Text.add(inFile.nextLine());
			}
			inFile.close();
		} 
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File not found");
		}
	}
	
	public static ArrayList<String> DisplayInputFile()
	{
		return Text;
	}
}
