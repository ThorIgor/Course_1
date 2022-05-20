
public class Animal {
	private int food, sleep;
	private boolean live;
	
	public Animal()
	{
		live = true;
		food = 100;
		sleep = 100;
	}
	
	public int getFood()
	{
		return food;
	}
	
	public int getSleep()
	{
		return sleep;
	}
	
	public void eat(int f)
	{
		if(live)
		{
			if(f < 0)
				System.out.println("Error");
			else if(food+f > 100)
				food = 100;
			else
				food+=f;
		}
		else
			System.out.println(this.getClass() + " is dead");
	}
	
	public void sleep(int s)
	{
		if(live)
		{
			if(s < 0)
				System.out.println("Error");
			else if(sleep+s > 100)
				sleep = 100;
			else
				sleep+=s;
		}
		else
			System.out.println(this.getClass() + " is dead");
	}
	
	public void live()
	{
		if(live)
		{
			sleep-=1;
			food-=1;
			if(food < 0 || sleep < 0)
				live = false;
		}
		else
			System.out.println(this.getClass() + " is dead");
	}
	
	public String toString()
	{
		if(live)
			return "Food: " + food + "\nSleep: " + sleep;
		else
			return "Dead";
	}
}
