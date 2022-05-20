
public class Triangle extends Figure{
	private double a, b, c;
	public Triangle(double a, double b, double c)
	{
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		double p = (a+b+c)/2;
		super.setArea(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	
	public void setA(double a) {
		this.a = a;
		double p = (a+b+c)/2;
		super.setArea(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	public void setB(double b) {
		this.b = b;
		double p = (a+b+c)/2;
		super.setArea(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	public void setC(double c) {
		this.c = c;
		double p = (a+b+c)/2;
		super.setArea(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
	}
	
	public double getA() {return a;}
	public double getB() {return b;}
	public double getC() {return c;}
	
	public String toString()
	{
		return super.toString() + "\nA: " + a + " B: " + b + " C: " + c;
	}
}
