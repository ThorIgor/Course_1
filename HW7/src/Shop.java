
public abstract class Shop {
	protected double priceOfWare;
	protected int numberOfWare;
	protected double money;
	
	public Shop(double m, double p)
	{
		money = m;
		priceOfWare = p;
	}
	
	public void addMoney(double m) {money+=m;}
	public void addWare(int n) {
		money -= n*priceOfWare;
		numberOfWare+=n;
	}
	
	public int getNumberOfWare() {return numberOfWare;}
	public double getPrice() {return priceOfWare;}
	
	abstract public Ware sellWare(double m);
	
	public String toString() {
		return this.getClass().getName() + 
				"\nMoney: " + money + 
				"\nNumber of ware: " + numberOfWare;
	}
}
