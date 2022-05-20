import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

public class Word{
	String word;
	HashMap<File, Integer> files = new HashMap<File, Integer>();
	
	public Word(String w, File f)
	{
		word = w;
		files.put(f, 1);
	}
	
	public void addFile(File f)
	{
		if(files.containsKey(f))
			files.replace(f, files.get(f)+1);
		else
			files.put(f, 1);
	}
	
	public boolean contains(File f)
	{
		return files.containsKey(f);
	}
	
	public String getWord() {return word;}
	
	public boolean equals(Word w) {return w.word == word;}
	
	public String toString() {
		String str = word + ":";
		for(File f:files.keySet())
			str+="\n"+f.getName() + " - " + files.get(f);
		return str;
	}
}
