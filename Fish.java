import java.util.ArrayList;

public class Fish extends Sandwich{
	
	public Fish()
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
		return 12.99 + (1.99 * extras.size());
	}

}
