import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Test {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		boolean end = false;
		while(!end)
		{	try{
			System.out.println("Linked list");
			System.out.println("1.Add integer");
			System.out.println("2.Print integers");
			System.out.println("3.Clear");
			System.out.println("4.Remove");
			System.out.println("5.Insert");
			System.out.println("6.Conteins");
			System.out.println("7.Add range");
			System.out.println("8.Remove range");
			System.out.println("9.Retrain");
			System.out.println("10.Contains range");
			int pr = DataInput.getInt("Write: ");
			Integer i;
			ArrayList<Integer> al = new ArrayList<Integer>();
			switch(pr)
			{
			case 1:
				i = DataInput.getInt("Integer: ");
				ll.add(i);
				break;
			case 2:
				for(Integer in:ll)
					System.out.println(in);
				break;
			case 3:
				ll.clear();
				break;
			case 4:
				i = DataInput.getInt("Integer: ");
				ll.remove(i);
				break;
			case 5:
				i = DataInput.getInt("Integer: ");
				int index = DataInput.getInt("Index: ");
				ll.add(index, i);
				break;
			case 6:
				i = DataInput.getInt("Integer: ");
				if(ll.contains(i))
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
			case 7:
				while(true)
				{
					i = DataInput.getInt("Integer: ");
					if(i == 0)
						break;
					al.add(i);
					System.out.println(al);
				}
				ll.addAll(al);
				break;
			case 8:
				while(true)
				{
					i = DataInput.getInt("Integer: ");
					if(i == 0)
						break;
					al.add(i);
					System.out.println(al);
				}
				ll.removeAll(al);
				break;
			case 9:
				while(true)
				{
					i = DataInput.getInt("Integer: ");
					if(i == 0)
						break;
					al.add(i);
					System.out.println(al);
				}
				ll.retainAll(al);
				break;
			case 10:
				while(true)
				{
					i = DataInput.getInt("Integer: ");
					if(i == 0)
						break;
					al.add(i);
					System.out.println(al);
				}
				if(ll.containsAll(al))
					System.out.println("Yes");
				else
					System.out.println("No");
				break;
			default:
				System.out.println("Error");
			}
			}catch(IOException ioe) {
				System.out.println(ioe.getMessage());
			}catch(Exception e) {
				System.out.println("Error");
			}
		}

	}

}
