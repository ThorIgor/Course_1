
public class Water extends Substance{
	public Water(double tem, double m){super(tem, m);}
	
	protected void setState()
	{
		if(temperature < 0)
			state = PhysicalState.Powder;
		else if(temperature > 100)
			state = PhysicalState.Gas;
		else
			state = PhysicalState.Liquid;
	}
}
