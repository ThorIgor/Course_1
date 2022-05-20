import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordReader {
	public static void main(String[] args) {
		String str = readString("file.txt");
		StringTokenizer strTkn = new StringTokenizer(str,",.&?!@/\\; ");
		String words[] = new String[strTkn.countTokens()];
		for(int i = 0; i < words.length; i++)
			words[i] = strTkn.nextToken();
		words = dellEmpty(words);
		System.out.println("Number of words: " + words.length);
		String uniqueWords[] = uniqueWords(words);
		System.out.println("Number of unique words: " + uniqueWords.length);
		String buff;
        for(int i = 0; i < uniqueWords.length; i++)
        {
            for(int j = i; j < uniqueWords.length; j++)
            {
                for(int k = 0; k < Math.max(uniqueWords[i].length(), uniqueWords[j].length()); k++)
                {
                    if(uniqueWords[i].charAt(k) == uniqueWords[j].charAt(k))
                        continue;
                    if(uniqueWords[i].charAt(k) > uniqueWords[j].charAt(k))
                    {
                    	buff = uniqueWords[i];
                    	uniqueWords[i] = uniqueWords[j];
                    	uniqueWords[j] = buff;
                        break;
                    }
                    else
                        break;
                }
            }
        }
        for(String wrd:uniqueWords)
        	System.out.println(wrd + " " + repeatWord(words, wrd));
	}
	
	private static String readString(String path)
	{
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			String str = "", s = "";
			do
			{
				s = br.readLine();
				if(s!=null)
					str+=s+" ";
			} while(s!=null);
			return str;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private static String[] dellEmpty(String[] words)
	{
		int count = 0;
		for(String w:words)
			if(w.length() == 0 || w.equalsIgnoreCase("-"))
				count++;
		String newWrd[] = new String[words.length-count];
		count = 0;
		for(int i = 0; i < words.length; i++)
		{
			if(words[i].length() == 0 || words[i].equalsIgnoreCase("-"))
			{
				count++;
				continue;
			}
			else
				newWrd[i-count] = words[i];
		}
		return newWrd;
	}
	
	private static String[] uniqueWords(String[] words)
	{
		String newWrd[] = new String[0];
		boolean find;
		for(int i = 0; i < words.length; i++)
		{
			find = false;
			for(int j = 0; j < newWrd.length; j++)
				if(newWrd[j].equalsIgnoreCase(words[i]))
					find = true;
			if(!find)
				newWrd = addWord(newWrd, words[i]);
		}
		return newWrd;
	}
	
	private static String[] addWord(String[] words, String word)
	{
		String newWrd[] = new String[words.length+1];
		for(int i = 0; i < words.length; i++)
			newWrd[i] = words[i];
		newWrd[words.length] = word;
		return newWrd;
	}
	
	private static int repeatWord(String[] words, String word)
	{
		int count = 0;
		for(String str:words)
			if(str.equalsIgnoreCase(word))
				count++;
		return count;
	}
}
