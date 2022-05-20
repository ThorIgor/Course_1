
public abstract class Ware {
	private double price;
	public Ware(double p) {setPrice(p);}
	
	public void setPrice(double p)
	{
		if(p < 0)
			price = 0;
		else
			price = p;
	}
	public double getPrice() {return price;}
	
	public String toString() {return this.getClass().getName() + "\nPrice: " + price;}
}
