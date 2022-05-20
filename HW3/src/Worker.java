
public class Worker {
	private int salary, fatigue;
	
	public Worker(int salary)
	{
		setSalary(salary);
		fatigue = 100;
	}
	
	public void setSalary(int s)
	{
		if(s < 0)
			salary = 0;
		else
			salary = s;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public int getFatigue()
	{
		return fatigue;
	}
	
	public void rest(int f)
	{
		if(f < 0)
			System.out.println("Error");
		else if(fatigue+f > 100)
			fatigue = 100;
		else
			fatigue+=f;
	}
	
	public void work()
	{
		if(fatigue < 20)
			System.out.println(this.getClass() + " is tired");
		else
			fatigue-=20;
	}
	
	public String toString()
	{
		return "Salary: " + salary + "\nFatigue: " + fatigue;
	}
}
