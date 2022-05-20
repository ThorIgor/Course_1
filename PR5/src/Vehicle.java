
public class Vehicle {
	private double mass;
	private Wheel wheels[];
	private MovingForce force;
	
	public Vehicle(double m, MovingForce f, Wheel[] w)
	{
		setMass(m);
		setForce(f);
		setWheels(w);
	}
	
	public void setMass(double m) {mass = Math.abs(m);}
	public void setForce(MovingForce f) {
		if(f != null)
			force = f;
		else
			force = new MovingForce(0);
	}
	public void setWheels(Wheel[] w) {
		if(w == null)
			wheels = new Wheel[0];
		else
			wheels = w;
	}
	public double getMass() {return mass;}
	public MovingForce getForce() {return force;}
	public Wheel[] getWheels() {return wheels;}
	
	public String toString()
	{
		String str = this.getClass().getName() + "\nMass: " + mass + "\n" + force;
		for(Wheel w:wheels)
			str+="\n"+w;
		return str;
	}
}
