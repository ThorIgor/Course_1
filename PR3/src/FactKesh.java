import java.math.BigInteger;

public class FactKesh {
	public static long fact[] = new long[20];
	
	public static long fact(int num)
	{
		if(num < 0 || num > 19)
		{
			System.out.println("Error");
			return 0;
		}
		if(fact[num] == 0)
		{
			long res = 1;
			for(int i = num; i >= 1; i--)
			{
				if(fact[i] == 0)
					res*=i;
				else
				{
					res*=fact[i];
					break;
				}
			}
			fact[num] = res;
			return res;
		}
		else
			return fact[num];
	}
}
