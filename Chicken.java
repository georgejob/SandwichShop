import java.util.ArrayList;

public class Chicken extends Sandwich{
	
	public Chicken()
	{
		extras = new ArrayList<Extra>();
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
		return 8.99 + (1.99 * extras.size());
	}

}
