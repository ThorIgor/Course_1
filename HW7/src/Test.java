
public class Test {

	public static void main(String[] args) {
		Shop fs = new FoodShop(1000);
		fs.addWare(10);
		System.out.println(fs.sellWare(110));
		System.out.println(fs);
		Shop cs = new ClothShop(1000);
		cs.addWare(10);
		System.out.println(cs);
		System.out.println(cs.sellWare(110));

	}

}
