
public class Horse extends MovingForce{
	private int years;
	public Horse(int years)
	{
		super(1);
		setYears(years);
	}
	
	public void setYears(int y)
	{
		if(y < 0)
			years = 0;
		else
			years = 1;
	}
	
	public int getYears() {return years;}
	
	public String toString()
	{
		return super.toString() + "\nYears: " + years;
	}
}
