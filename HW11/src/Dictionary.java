import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Dictionary {
	private HashMap<String, Word> words = new HashMap<String, Word>();
	private ArrayList<File> files = new ArrayList<File>();
	
	@SuppressWarnings("unlikely-arg-type")
	public void addFile(File f)
	{
		files.add(f);
		String str = "";
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			do
			{
				s = br.readLine();
				if(s!=null)
					str+=s+" ";
			} while(s!=null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		StringTokenizer st = new StringTokenizer(str,",.&?!@/\\; ");
		for(int i = 0; i < st.countTokens(); i++)
		{
			String word = st.nextToken();
			if(words.containsKey(word))
				words.get(word).addFile(f);
			else
				words.put(word, new Word(word, f));
			System.out.println(i);
		}
	}
	
	public HashMap<String, Word> getWords() { return words; }
	
	public String toString() {
		String str = "Dictionary: " + words.size();
		for(String wr:words.keySet())
			str+="\n**********\n"+words.get(wr);
		return str;
	}
}
