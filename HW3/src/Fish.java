import java.awt.Color;

public class Fish extends Animal{
	private String color;
	
	public Fish(String c)
	{
		super();
		color = c;
	}
	
	public String toString()
	{
		return color + " fish\n" + super.toString();
	}
}
