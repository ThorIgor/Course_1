
public class CodedString {
	private String str;
	private String codedStr;
	private int cod;
	
	public CodedString(String s, int c)
	{
		str = s;
		cod = c;
		codedStr = null;
	}
	
	public void setString(String s)
	{
		str = s;
		codedStr = null;
	}
	
	public void setCode(int c)
	{
		cod = c;
		codedStr = null;
	}
	
	public String getString()
	{
		return str;
	}
	
	public String toString()
	{
		if(codedStr == null)
		{
			codedStr = "";
			for(int i = 0; i < str.length(); i++)
				codedStr+=(char)(str.charAt(i)+cod);
			return codedStr;
		}
		else
			return codedStr;
	}
}
