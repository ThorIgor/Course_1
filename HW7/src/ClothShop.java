
public class ClothShop extends Shop{
	public ClothShop(double m) {super(m, 100);}
	
	public Ware sellWare(double m)
	{
		if(numberOfWare > 0 && m > priceOfWare)
		{
			numberOfWare--;
			money+=m;
			return new Cloth(priceOfWare);
		}
		else
			return null;
	}
}
