import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		/*while(true)
		{
			try {
				System.out.println("Fact: " + Fact.fact(DataInput.getInt("Number: ")));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		while(true)
		{
			try {
				System.out.println("Fact: " + FactKesh.fact(DataInput.getInt("Number: ")));
				System.out.println("--------Kesh---------");
				for(int i = 0; i < FactKesh.fact.length; i++)
					if(FactKesh.fact[i] != 0)
						System.out.println(i + "! = " + FactKesh.fact[i]);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
