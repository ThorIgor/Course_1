
public class AnimalKeeper extends Worker{
	public Animal[] animals;
	
	public AnimalKeeper(int salary)
	{
		super(salary);
		animals = new Animal[0];
	}
	
	public void setAnimals(Animal[] a)
	{
		animals = a;
	}
	
	public void addAnimal(Animal a)
	{
		Animal newA[] = new Animal[animals.length+1];
		for(int i = 0 ; i < animals.length; i++)
			newA[i] = animals[i];
		newA[animals.length] = a;
		animals = newA;
	}
	
	public Animal[] getAnimals()
	{
		return animals;
	}
	
	public String toString()
	{
		String str = "Animal kepper:\n" + super.toString();
		str+="\nAnimals: ";
		for(int i = 0; i < animals.length; i++)
			str+="\n" + animals[i];
		return str;
	}
}
