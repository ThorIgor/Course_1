import java.io.IOException;

public class Test {
	public static void main(String[] args) {
		CodedString codStr = null;
		while(true)
		{
			if(codStr == null)
				System.out.println("Coded string: null");
			else
				System.out.println("Coded string: " + codStr);
			System.out.println("1. New string");
			System.out.println("2. Set string");
			System.out.println("3. Set cod");
			try
			{
				int prg = DataInput.getInt(">");
				switch(prg)
				{
				case 1:
					String str = DataInput.getString("String: ");
					int cod = DataInput.getInt("Cod: ");
					codStr = new CodedString(str, cod);
					break;
				case 2:
					String strS = DataInput.getString("String: ");
					codStr.setString(strS);
					break;
				case 3:
					int codS = DataInput.getInt("Cod: ");
					codStr.setCode(codS);
					break;
				default:
					System.out.println("Error");
					break;
				}
			}catch(IOException e)
			{
				System.out.println("Error");
			}
		}
	}
}
