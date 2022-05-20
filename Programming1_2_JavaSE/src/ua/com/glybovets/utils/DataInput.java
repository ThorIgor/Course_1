package ua.com.glybovets.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class DataInput {

	private static void writeText(String wr){
		if (wr == null)
			System.out.print("Введіть дані: ");
		else 
			System.out.print(wr);
	}
	
	public static Long getLong() throws IOException{
		String s = getString();
		Long value = Long.valueOf(s);
		return value;
	}
	
	public static char getChar() throws IOException{
		String s = getString();
		return s.charAt(0);
	}
	
	public static Integer getInt(String wr) throws IOException{
		writeText(wr);
		String s = "";
		s = getString();
		Integer value = Integer.valueOf(s);
		return value;
		
	}
	
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
	public static String getString(String wr) throws IOException{
		writeText(wr);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
	
}
