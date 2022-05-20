
public class Figure {
	private double area;
	
	public Figure()
	{
		area = 0;
	}
	
	public Figure(double a)
	{
		area = a;
	}
	
	protected void setArea(double a)
	{
		area = a;
	}
	
	public double getArea()
	{
		return area;
	}
	
	public String toString()
	{
		return this.getClass().getName() + "\nArea: " + area;
	}
}
