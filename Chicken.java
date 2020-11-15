
public class Chicken extends Sandwich{
	
	public Chicken()
	{
		
	}

	@Override
	public boolean add(Object obj) {
		return false;
	}

	@Override
	public boolean remove(Object obj) {
		return false;
	}

	@Override
	public double price() {
		return 8.99;
	}

}
