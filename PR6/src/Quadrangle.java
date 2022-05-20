
public class Quadrangle extends Figure{
	private double d1, d2;
	private double angle;
	
	public Quadrangle()
	{
		d1 = 0;
		d2 = 0;
		angle = 0;
	}
	
	public Quadrangle(double d1, double d2, double angle)
	{
		super();
		this.d1 = d1;
		this.d2 = d2;
		if(angle > 180)
			angle=angle%180;
		this.angle = angle;
		super.setArea(d1*d2*Math.sin(angle)/2);
	}
	
	public void setD1(double d) {
		d1 = d;
		super.setArea(d1*d2*Math.sin(angle)/2);
	}
	public void setD2(double d) {
		d2 = d;
		super.setArea(d1*d2*Math.sin(angle)/2);
	}
	public void setAngle(double a){
		angle = a;
		super.setArea(d1*d2*Math.sin(angle)/2);
	}
	
	public double getD1() {return d1;}
	public double getD2() {return d2;}
	public double getAngle() {return angle;}
	
	public String toString(){
		return super.toString() + "\nD1: " + d1 + " D2: " + d2 + "\nAngle: " + angle;
	}
	
}
