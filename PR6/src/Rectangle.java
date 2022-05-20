
public class Rectangle  extends Quadrangle{
	private double a, b;
	public Rectangle(double a, double b)
	{
		super();
		this.a = a;
		this.b = b;
		double d = Math.sqrt(a*a+b*b);
		double angle = Math.acos(Math.abs((2*Math.pow(d/2, 2) - a*a)/(2*(2*Math.pow(d/2, 2)))));
		super.setAngle(angle);
		super.setD1(d);
		super.setD2(d);
		super.setArea(a*b);
	}
	
	public void setA(double a) {
		this.a = a;
		super.setD1(Math.sqrt(a*a+b*b));
		super.setD2(Math.sqrt(a*a+b*b));
		super.setAngle(Math.acos((Math.sqrt(a*a+b*b)*(Math.sqrt(a*a+b*b)/2) - a*a)/Math.sqrt(a*a+b*b)*(Math.sqrt(a*a+b*b)/2)));
		super.setArea(a*b);
	}
	public void setB(double b) {
		this.b = b;
		super.setD1(Math.sqrt(a*a+b*b));
		super.setD2(Math.sqrt(a*a+b*b));
		super.setAngle(Math.acos((Math.sqrt(a*a+b*b)*(Math.sqrt(a*a+b*b)/2) - a*a)/Math.sqrt(a*a+b*b)*(Math.sqrt(a*a+b*b)/2)));
		super.setArea(a*b);
	}
	
	public double getA() {return a;}
	public double getB() {return b;}
	
	public String toString()
	{
		return super.toString() + "\nA: " + a + " B: " + b;
	}
}
