
public class FoodShop extends Shop{
	public FoodShop(double m) {super(m, 10);}
	
	public Ware sellWare(double m)
	{
		if(numberOfWare > 0 && m > priceOfWare)
		{
			numberOfWare--;
			money+=m;
			return new Food(priceOfWare);
		}
		else
			return null;
	}
}
