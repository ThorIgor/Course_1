package ua.com.glybovets.lecture2;

import java.math.*;

public class BigNumbersExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger b = BigInteger.valueOf(5);
		int c = 10;
		BigInteger d = BigInteger.valueOf(c);
		
		d = d.add(b);
		System.out.println(d);
	}

}
