
public class Circle extends Figure{
	private double radius;
	public Circle(double r)
	{
		super(r*r*Math.PI);
		radius = r;
	}
	
	public void setRadius(double r)
	{
		super.setArea(r*r*Math.PI);
		radius = r;
	}
	
	public double getRadius() {return radius;}
	
	public String toString()
	{
		return super.toString()+"\nRadius: " + radius;
	}
}
