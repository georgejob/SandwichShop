
public class OrderLine 
{
	private int lineNumber; //a serial number created when a sandwich is addded to order
	private Sandwich sandwich;
	private double price;
	
	public OrderLine(int lineNumber, Sandwich sandwich, double price)
	{
		this.lineNumber = lineNumber;
		this.sandwich = sandwich;
		this.price = price;
	}
	
	
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	
	public int getLineNumber()
	{
		return lineNumber;
	}
	
	public void adjustPrice(double amount)
	{
		price += amount;
	}
	
	public String toString()
	{
		String line = Integer.toString(lineNumber);
		if(sandwich.getClass().getName().equals("Chicken"))
		{
			line += " Chicken Sandwich: Fried Chicken, Mayo, Pickles, ";
		}
		else if(sandwich.getClass().getName().equals("Beef"))
		{
			line += " Burger Sandwich: Beef Patty, Bun, Ketchup, ";
		}
		else if(sandwich.getClass().getName().equals("Fish"))
		{
			line += " Fish Sandwich: Fried Cod, TarTar, Lettuce, ";
		}
		
		if(sandwich.extras.size() > 0)
		{
			line += "Extras: ";
			for(Extra e : sandwich.extras)
			{
				line += e + ", ";
			}
		}
		
		line += "Price: $" + sandwich.price();
		
		return line;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public Sandwich getSandwich()
	{
		return sandwich;
	}
}