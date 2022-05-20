
public class Car extends Vehicle{
	public int seats;
	
	public Car(double mass, double power, double conOfPe, int seats)
	{
		super(mass, new Motor(power, conOfPe), new Wheel[4]);
		setSeats(seats);
	}
	
	public void setSeats(int s) {
		if(s < 1)
			seats = 1;
		else
			seats = s;
	}
	
	public int getSeats() {return seats;}
	
	public String toString()
	{
		return super.toString() + "\nSeats: " + seats;
	}
}
