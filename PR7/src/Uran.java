
public class Uran extends Substance implements Radioactive {
	public static final double RADIATION_OF_ONE_G = 12.5;
	
	public Uran(double tem, double m) {super(tem, m);}
	
	protected void setState()
	{
		if(temperature <  1132)
			state = PhysicalState.Powder;
		else if(temperature > 3746)
			state = PhysicalState.Gas;
		else
			state = PhysicalState.Liquid;
	}
	
	public void decay() {System.out.println("Uran is disintegrating");}
	public double getRadiation() {return RADIATION_OF_ONE_G*mass;}
}
