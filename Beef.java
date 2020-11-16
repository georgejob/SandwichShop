import java.util.ArrayList;

public class Beef extends Sandwich{
	
	public Beef()
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
		return 10.99 + (1.99 * extras.size());
	}

}
