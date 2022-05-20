
public class Rectangle {
	private int x1, x2;
	private int y1, y2;
	
	public Rectangle()
	{
		setX1(0);
		setX2(0);
		setY1(0);
		setY2(0);
	}
	public Rectangle(int x, int y)
	{
		setX1(x);
		setX2(x);
		setY1(y);
		setY2(y);
	}
	public Rectangle(int x1, int y1, int x2, int y2)
	{
		setX1(x1);
		setX2(x2);
		setY1(y1);
		setY2(y2);
	}
	
	public void setX1(int x) {x1 = x;}
	public void setX2(int x) {x2 = x;}
	public void setY1(int y) {y1 = y;}
	public void setY2(int y) {y2 = y;}
	
	public int getX1() {return x1;}
	public int getX2() {return x2;}
	public int getY1() {return y1;}
	public int getY2() {return y2;}
	
	public void move(int x, int y)
	{
		x1+=x;
		x2+=x;
		y1+=y;
		y2+=y;
	}
	
	public boolean isPointInside(int x, int y)
	{
		if(x >= x1 && x <= x2 && y <= y1 && y >= y2)
			return true;
		else
			return false;
	}
	
	public String toString()
	{
		if(x1 > x2 || y1 < y2)
			return null;
		else
			return "x1 = " + x1 + ", y1 = " + y1 + ", x2 = " + x2 + ", y2 = " + y2;
	}
	
	public Rectangle association(Rectangle r)
	{
		return new Rectangle(Math.min(x1, r.x1), Math.max(y1, r.y1), Math.max(x2, r.x2), Math.min(y2, r.y2));
	}
	
	public Rectangle intersection(Rectangle r)
	{
		if(r.x1 > x2 || r.y1 < y2)
			return null;
		return new Rectangle(Math.max(x1, r.x1), Math.min(y1, r.y1), Math.min(x2, r.x2), Math.max(y2, r.y2));
	}
}
