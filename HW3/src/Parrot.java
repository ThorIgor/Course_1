
public class Parrot extends Animal{
	private String color;
	private boolean canSpeak;
	
	public Parrot(String c, boolean cS)
	{
		super();
		color = c;
		canSpeak = cS;
	}
	
	public String toString()
	{
		String str = color + " parrot\n" + super.toString() + "\n";
		if(canSpeak)
			str+="Parrot can speak";
		else
			str+="Parrot cant speak";
		return str;
	}
}
