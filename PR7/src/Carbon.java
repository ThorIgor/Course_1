
public class Carbon extends Substance implements Combustible {
	public static final double TEM_OF_BURN = 1200;
	
	public Carbon(double tem, double m) {super(tem, m);}
	
	protected void setState()
	{
		if(temperature < 1239)
			state = PhysicalState.Powder;
		else if(temperature > 4827)
			state = PhysicalState.Gas;
		else
			state = PhysicalState.Liquid;
	}
	
	public void burn() 
	{
		temperature = 1200;
		setState();
		System.out.println("Carbon is burning");
	}
	public double getTemOfBurn() {return TEM_OF_BURN;}
}
