import java.util.ArrayList;

public class Order implements Customizable
{	
	public static int lineNumber; //reset for each new order
	public ArrayList<OrderLine> orderlines;
	
	public Order()
	{
		lineNumber = 1;
		orderlines = new ArrayList<OrderLine>();
	}
	
	@Override
	public boolean add(Object obj) 
	{
		// TODO Auto-generated method stub
		OrderLine temp = (OrderLine) obj;
		temp.setLineNumber(lineNumber);
		if(orderlines.add(temp))
		{
			lineNumber++;
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public boolean remove(Object obj) 
	{
		// TODO Auto-generated method stub
		OrderLine temp = (OrderLine) obj;
		if(orderlines.remove(temp))
		{
			lineNumber--;
			
			int i=1;
			for(OrderLine or : orderlines)
			{
				if(or != null)
				{
					or.setLineNumber(i);
					i++;
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}

}