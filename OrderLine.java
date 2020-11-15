
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
}