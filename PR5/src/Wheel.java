
public class Wheel {
	public double radius, thickness;
	
	public Wheel()
	{
		radius = 20;
		thickness = 15;
	}
	
	public Wheel(double r, double t)
	{
		setRadius(r);
		setThickness(t);
	}
	
	public void setRadius(double r) {radius = Math.abs(r);}
	public void setThickness(double t) {thickness = Math.abs(t);}
	
	public double getRadius() {return radius;}
	public double getThickness() {return thickness;}
	
	public String toString()
	{
		return "Wheel: " + radius + ":" + thickness;
	}
}
