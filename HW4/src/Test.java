import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		Rectangle rec = null;
		while(true)
		{
			if(rec == null)
				System.out.println("Rectangel: null");
			else
				System.out.println("Rectangle: " + rec);
			System.out.println("1. New rectangle");
			System.out.println("2. Move rectangle");
			System.out.println("3. Point in rectangle");
			System.out.println("4. Assotiation");
			System.out.println("5. Intersection");
			try
			{
				int prg = DataInput.getInt(">");
				switch(prg)
				{
				case 1:
					int x1 = DataInput.getInt("x1 = ");
					int y1 = DataInput.getInt("y1 = ");
					int x2 = DataInput.getInt("x2 = ");
					int y2 = DataInput.getInt("y2 = ");
					rec = new Rectangle(x1, y1, x2, y2);
					break;
				case 2:
					int x = DataInput.getInt("x = ");
					int y = DataInput.getInt("y = ");
					rec.move(x, y);
					break;
				case 3:
					int xP = DataInput.getInt("x = ");
					int yP = DataInput.getInt("y = ");
					if(rec.isPointInside(xP, yP))
						System.out.println("Point inside");
					else
						System.out.println("Point outside");
					break;
				case 4:
					
					int xA1 = DataInput.getInt("x1 = ");
					int yA1 = DataInput.getInt("y1 = ");
					int xA2 = DataInput.getInt("x2 = ");
					int yA2 = DataInput.getInt("y2 = ");
					if(rec == null)
						rec = new Rectangle(xA1, yA1, xA2, yA2);
					else
						rec = rec.association(new Rectangle(xA1, yA1, xA2, yA2));
					break;
				case 5:
					int xI1 = DataInput.getInt("x1 = ");
					int yI1 = DataInput.getInt("y1 = ");
					int xI2 = DataInput.getInt("x2 = ");
					int yI2 = DataInput.getInt("y2 = ");
					if(rec == null)
						rec = null;
					else
						rec = rec.intersection(new Rectangle(xI1, yI1, xI2, yI2));
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
