
class MyExaption extends Exception
{
	public MyExaption(String er) {super(er);}
}

public class ExaptionTest {

	public static void main(String[] args) {
		try
		{
			throw new MyExaption("Its my exaption");
		}
		catch(MyExaption me) {
			System.out.println(me.getMessage());
		}
		
	}

}
