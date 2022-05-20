
public class MovingForce {
	private double power;
	
	public MovingForce(double p)
	{
		setPower(p);
	}
	
	public void setPower(double p) {power = Math.abs(p);}
	public double getPower() {return power;}
	
	public String toString()
	{
		return this.getClass().getName() + "\nPower: " + power;
	}
}
