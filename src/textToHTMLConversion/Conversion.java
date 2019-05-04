package textToHTMLConversion;

import java.util.ArrayList;

public class Conversion {
	
	static String ConvertedText = "<html>\n";
	static String CustomSymbol [] = {"_","*","!","%","-"};
	String HTML [] = {"<i>","<b>","<b>","<u>","<li>"};
	int flag [] = {1,1,1,2,1,3};
	
	public static void Convert(ArrayList<String> Text)
	{
		int i = 0;
		if(Text.get(i).contains("titl:e"))
		{
			ConvertedText += "<head>\n<title>\n" + Text.get(i) + "</title>\n</head>\n<body>\n";
			i++;
		}
		else
		{
			ConvertedText += "<body>\n";
		}
		for(;i<=Text.size();i++)
		{
			ConvertedText += "<p>";
			String tempLine = Text.get(i);
			for(int j=0;j<=CustomSymbol.length;j++)
			{
				if(tempLine.contains(CustomSymbol[j]))
				{
					if(flag[j]==1)
					{
						
					}
				}
			}
		}
	}
}
