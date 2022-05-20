import java.math.*;

public class Fact {
	public static BigInteger fact(int num)
	{
		if(num < 0)
		{
			System.out.println("Error");
			return BigInteger.valueOf(0);
		}
		BigInteger res = BigInteger.valueOf(1);
		for(int i = 1; i <= num; i++)
			res = res.multiply(BigInteger.valueOf(i));
		return res;
	}
}
