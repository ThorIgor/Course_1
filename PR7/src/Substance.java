
abstract public class Substance {
	protected PhysicalState state;
	protected double mass;
	protected double temperature;
	
	public Substance(double tem, double m)
	{
		temperature = tem;
		mass = m;
		setState();
	}
	
	abstract protected void setState();
	public PhysicalState getState() {return state;}
	
	public void setTemperature(int tem)
	{
		temperature = tem;
		setState();
	}
	public double getTemperature() {return temperature;}
	
	public void setMass(double m) {mass = m;}
	public double getMass() {return mass;}
	
	public String toString()
	{
		return this.getClass().getName() + "\nTemperature: " + temperature + "\n" + state;
	}
}
