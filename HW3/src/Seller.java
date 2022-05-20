
public class Seller extends Worker{
	public int paydesk;
	
	public Seller(int salary, int paydesk)
	{
		super(salary);
		setPaydesk(paydesk);
	}
	
	public void setPaydesk(int p)
	{
		if(p < 0)
			paydesk = 0;
		else
			paydesk = p;
	}
	
	public int getPaydesk()
	{
		return paydesk;
	}
	
	public String toString()
	{
		return "Seller at " + paydesk + " paydesk\n" + super.toString();
	}
}
