
public class Motor extends MovingForce{
	private double consumptionOfPetrol;
	
	public Motor(double power, double conOfPe)
	{
		super(power);
		setConsumptionOfPetrol(conOfPe);
	}
	
	public void setConsumptionOfPetrol(double c) {consumptionOfPetrol = Math.abs(c);}
	
	public double getConsumptionOfPetrol() {return consumptionOfPetrol;}
	
	public String toString()
	{
		return super.toString() + "Consumption of petrol: " + consumptionOfPetrol;
	}
}
